//pracitce oop and arraylists

//have user decide if they like the item and how much do they want
//print the number of fruits and vegetables
//print the total cost and weight

//ERRORS: hashcode printing instead of item name, loop ending after one yes, anticipating users to input something other than asked for (eg.  enters letter instead of number)

import java.lang.*;
import java.util.*; //is this needed for equalsIgnoreCase?
public class Groceries {


  public static void main(String[] args){

    Fruit apple = new Fruit("red", 0.20, 5);
    Fruit pear = new Fruit("green", 0.40, 7);
    Fruit pineapple = new Fruit("yellow", 2.75 , 32);
    Fruit banana = new Fruit("yellow", 0.60, 4);
    Fruit mango = new Fruit("orange", 1.30, 6);
    Fruit strawberry = new Fruit("red", 0.10 , 0.4);

    Vegetable asparagus = new Vegetable("green", 1, 0.6);
    Vegetable bokchoy = new Vegetable("green", 0.80, 0.5);
    Vegetable potato = new Vegetable("brown", 2.75 , 7.5);
    Vegetable tomato = new Vegetable("red", 0.85, 3.2);
    Vegetable carrot = new Vegetable("orange", 0.49, 2.2);

    //find the total cost of each green vegetable!
      Double totalCost = 0.0;
      Vegetable[] list = {asparagus, bokchoy, potato, tomato, carrot};
      for (int i = 0; i < list.length; i++){
        if (list[i].getColor() == "green"){
          totalCost += list[i].getWeight();
        }
      }
      //System.out.println("The total cost of green vegetables are $" + totalCost);

      //create list of all items to make a loop for asking user
      ArrayList<Object> GroceryList = new ArrayList<>();
      GroceryList.add( (Object) apple );
      GroceryList.add( (Object) pear );
      GroceryList.add( (Object) pineapple );
      GroceryList.add( (Object) banana );
      GroceryList.add( (Object) mango );
      GroceryList.add( (Object) strawberry );
      GroceryList.add( (Object) asparagus );
      GroceryList.add( (Object) bokchoy );
      GroceryList.add( (Object) potato );
      GroceryList.add( (Object) tomato );
      GroceryList.add( (Object) carrot );

      //create a list personal to the user
      ArrayList<Object> UserList = new ArrayList<>();
      int totalWeight = 0;
      int numberOfFruits = 0;
      int numberOfVegetables = 0;
      int numberOfGreen = 0;
      int numberOfOrange = 0;
      double totalPrice = 0;

      for (int i = 0; i < GroceryList.size(); i++){
        //asks user if they like the item
        StdOut.print("Do you like " + GroceryList.get(i) + "? Y or N");
        String answer = StdIn.readString();

        //if yes
        if (answer.equalsIgnoreCase("Y")){ //makes answer not case sensitive
          UserList.add(GroceryList.get(i));
          //asks amount user wants
        //  StdOut.print("How many would you like?" );
        //  int number = StdIn.readInt();
        //  GroceryList.get(i).setQuantity(number);

          //if fruit
          if (GroceryList.get(i) instanceof Fruit){ //looks right?

            StdOut.print("How many would you like?" );
            int n = StdIn.readInt();

            numberOfFruits += n;
            totalWeight += (n * ((Fruit)GroceryList.get(i)).getWeight() );
            totalPrice += (n * ((Fruit)GroceryList.get(i)).getPrice() );
          }

          //if vegetable
          if (GroceryList.get(i) instanceof Vegetable){
            StdOut.print("How many would you like?" ); // try to save the number
            int n = StdIn.readInt();
            numberOfVegetables += n;
            totalWeight += (n * ((Vegetable)GroceryList.get(i)).getWeight() );
            totalPrice += (n * ((Vegetable)GroceryList.get(i)).getPrice() );
          }


        }
        if (answer.equalsIgnoreCase("N")){ //makes answer not case sensitive
          continue;
        //}
        //test case error
        //else{
          //StdOut.println("Only respond Y or N!");
          //break;
        //}

        }

        //StdOut.println("Your total cost is " + totalCost +  ".\nYour total weight is " + totalWeight + ". " + "\nThere are " + numberOfFruits " fruits and " + " vegetables. " + "\n There are " + numberOfGreen + "green items and " + numberOfOrange + "orange items." );
        StdOut.println("You are buying the following items: " + UserList);
        StdOut.println("Your total cost is $" + totalCost);

    }

  }
}
