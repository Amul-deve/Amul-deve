package Questions;
/*Write a program to print the area of two rectangles having sides (4,5) and (5,8)
respectively by creating a class named 'Rectangle' with two instance variables,
length and breadth and a  method named 'Area' which returns the area.
Initialise the object attributes by taking the input from the user in the constructor*/
import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    Rectangle(){
        Scanner s=new Scanner(System.in);
        length=s.nextInt();
        breadth=s.nextInt();
    }
}
class Ty6{
    public static void main(String[] args) {
        Rectangle r1,r2;
        r1=new Rectangle();
        r2=new Rectangle();
        System.out.println("Area is "+r1.area());
        System.out.println("Area is "+r2.area());
    }
}