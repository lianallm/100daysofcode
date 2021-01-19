var contextMenuItem ={
  "id" : "spendMoney",
  "title" : "SpendMoney",
  "contexts" : ["selection"]
};

function isInt(value) {
  return !isNaN(value) &&
         parseInt(Number(value)) == value &&
         !isNaN(parseInt(value, 10));
}

chrome.contextMenus.create(contextMenuItem);
chrome.contextMenus.onClicked.addListener(function(clickData){
  if (clickData.menuItemId == "spendMoney" && clickData.selectionText){ //if user clicks on item id and selects something
    if (isInt(clickData.selectionText)){
            chrome.storage.sync.get(['total','limit'], function(budget){ //call back function
                var newTotal = 0; //initializes new total to 0
                if (budget.total){
                    newTotal += parseInt(budget.total);
                }
                newTotal += parseInt(clickData.selectionText);
                chrome.storage.sync.set({['total']: newTotal}, function(){
                  if (newTotal >= budget.limit){
                    var notifOptions = {
                      type:'basic',
                      iconUrl: 'icon48.png',
                      title: 'Limit reached!',
                      message: "Uh oh! You reached your limit!"
                    };
                    chrome.notifications.create('limitNotif', notifOptions);
                    chrome.notifications.clear('limitNotif');
                  }
               });
           });
       }
   }
});

chrome.storage.onChanged.addListener(function(changes, storageName){ // creates badge
    chrome.browserAction.setBadgeText({"text": changes.total.newValue.toString()}); //when total changes,
});
