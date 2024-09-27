public class Main {

  public static void main(String[] args) {
    Car nissan = new Car("Toyota", 1000.568, 2020, "Green"); // car object
    // nissan.make = "Toyota"; // these are the fields.
    // nissan.price = 1000.568;
    // nissan.year = 2020;
    // nissan.color = "Green";
    System.out.println(
      "This " +
      nissan.getMake() +
      " is worth $" +
      nissan.getPrice() +
      ". It was built in " +
      nissan.getYear() +
      ". It is " +
      nissan.getColor() +
      ".\n"
    );
    nissan.setColor("Blue");
  }
}

class Car {

  private String make;
  private double price;
  private int year;
  String color;

  public Car(String make, double price, int year, String color) {
    this.make = make;
    this.price = price;
    this.year = year;
    this.color = color;
  }

  public String getMake() {
    return make;
  }

  public double getPrice() {
    return price;
  }

  public int getYear() {
    return year;
  }

  public String getColor() {
    return color;
  }

  //Setter--

  public void setMake(String make) {
    this.make = make;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public void setYear(int year){
    this.year = year;
  }
  public void setColor(String color){
    this.color = color;
  }
}
