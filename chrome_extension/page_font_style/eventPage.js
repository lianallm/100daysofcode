chrome.runtime.onMessage.addListener(function(request, sender, sendResponse){
  if (request.todo == "showPageAction"){
    chrome.tabs.query({active:true, currentWindow: true}, function(tabs){//retrives all tabs active in the current window with callback fxn
      chrome.pageAction.show(tabs[0].id); //one particular tab and its id
    });
  }
})
