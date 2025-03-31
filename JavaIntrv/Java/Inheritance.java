package Java;

class Bicycle{
    private int gear;
    private int speed;

    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public int getGear(){
        return gear;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        if(speed >= 0){
            this.speed = speed;
        }
        else{
            System.out.println("Speed can't be negative");
        }
    }
    public void applyBrake(int decrement){
        setSpeed(speed-decrement);
    }
    public void speedup(int increment){
        setSpeed(speed+increment);
    }
    public String toString(){
        return "No of gears: "+gear+"\nSpeed: "+speed;
    }
}

class MountainBike extends Bicycle{
    private int seatHeight;
    public MountainBike(int gear, int speed, int startHeight){
        super(gear, speed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    @Override public String toString(){
        return (super.toString() + "\nseat height is "+seatHeight);
    }

}

public class Inheritance {
    public static void main(String[] args) {
        MountainBike bike = new MountainBike(3, 100, 25);
        System.out.println(bike.toString());

        
    }
}
