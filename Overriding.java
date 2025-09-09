import java.util.*;
class Vehicle{
    void wheel(){
        System.out.println("vehicle has wheels");
    }
    void engine(){
        System.out.println("350cc");
    }
}
class Bike extends Vehicle{
    void wheel(){
        System.out.println("bike has 2");
    }
}
class Car extends Vehicle{
    void wheel(){
        System.out.println("car has the 4");
    }
}
class Overriding{
    public static void main(String args[]){
        Vehicle vh;
        vh = new Car();
        vh.wheel();
        vh = new Bike();
        vh.wheel();
        /*Car c;
        c = new Vehicle();
        c.wheel();*/ //this code will not work ;
        // we can not create the objects of parent class with the revefrnce of sub class.
    }
}