
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class Main{
    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();

        Car car1 = new Car("C001", "Toyota", "Camry", 1200.0); // Different base price per day for each car
        Car car2 = new Car("C002", "Honda", "Accord", 1000.0);
        Car car3 = new Car("C003", "Mahindra", "Thar", 1100.0);
        Car car4 = new Car("C004", "Mahindra", "Scorpio", 1100.0);
        Car car5 = new Car("C005", "Chevrolet", "Cruize", 2000.0);
        Car car6 = new Car("C006", "Mercedes", "Maybach", 5500.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);
        rentalSystem.addCar(car4);
        rentalSystem.addCar(car5);
        rentalSystem.addCar(car6);

        rentalSystem.menu();
    }
}
