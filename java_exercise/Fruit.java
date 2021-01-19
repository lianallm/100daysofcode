
public class Fruit{

  //instance variables
  private String color;
  private double price;
  private double weight;
  private int quantity;

  //constructor
  public Fruit(String c, double p, double w){
    this.color = c;
    this.price = p;
    this.weight = w; //in ounces!
    this.quantity = 0;
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

  public double getQuantity(){
    return quantity;
  }

  public void setQuantity(int quant){
    this.quantity = quant;
  }


  public static void main(String[] args){

    Fruit apple = new Fruit("red", 0.20, 5);
    Fruit pear = new Fruit("green", 0.40, 7);
    Fruit pineapple = new Fruit("yellow", 2.75 , 32);
    Fruit banana = new Fruit("yellow", 0.60, 4);
    Fruit mango = new Fruit("orange", 1.30, 6);
    Fruit strawberry = new Fruit("red", 0.10 , 0.4);


  }

}
