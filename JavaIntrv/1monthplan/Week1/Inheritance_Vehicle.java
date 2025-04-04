class Vehicle{
    private String brand;
    private int price;
    
    public Vehicle(String brand, int price){    //Constructor is defined as if we don't define the and call Vehicle obj = new Vehicle()
        this.brand = brand;                     // It will return brand: null and price: 0 as default const. will be called
        this.price = price;                     // but if we'll define so it will return brand and price.
    }
    public void getDetails(){
        System.out.println(brand+" "+price);
    }
    
}

class Car extends Vehicle{
    private int noOfDoors;
    public Car(String brand, int speed, int noOfDoors){
        super(brand, speed);
        this.noOfDoors = noOfDoors;
    }
    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("No of doors: "+noOfDoors);
    }
}

class Bike extends Vehicle{
    boolean hasCarrier;
    public Bike(String brand, int speed, boolean hasCarrier){
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }
    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("Has carrier: "+hasCarrier);
    }
}

public class Inheritance_Vehicle {
    public static void main(String[] args) {
        Car myCar = new Car("Honda City", 180, 4);
        Bike myBike = new Bike("Yamaha MT-15", 140, true);

        System.out.println("Car Info:");
        myCar.getDetails();

        System.out.println("\nBike Info:");
        myBike.getDetails();
    }
}
