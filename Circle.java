package oopconcepts.Polymorphism.ShapesnArea;

import java.util.Scanner;

public class Circle  extends Shape{
    static Scanner sc = new Scanner(System.in);
    @Override
    void computeArea() {
        System.out.println("Area : "+ (x*x*Math.pi));
    }
    public Circle(){
        System.out.println("Enter radius : ");
        x = sc.nextDouble();
    }
}



