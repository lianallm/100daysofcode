public class Vegetable{

  //instance variables
  private String color;
  private double price;
  private double weight;

  //constructor
  public Vegetable(String c, double p, double w){
    this.color = c;
    this.price = p;
    this.weight = w; //in ounces!
  }

  //accessor methods

  public String getColor(){
    return color;
  }

  public double getPrice(){
    return price;
  }

  public double getWeight(){
    return weight;
  }


  public static void main(String[] args){
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
    System.out.println("The total cost of green vegetables are $" + totalCost);

  }
}
