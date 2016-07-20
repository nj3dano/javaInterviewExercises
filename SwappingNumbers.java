// a program to swap two numbers without using temporary variable
// 7/19/16 dak
// example, x = 10, y = 20, after swap x = 20, y = 10

public class SwappingNumbers {
 
    public static void main(String a[]){
        int x = 10;
        int y = 20;

        System.out.println("Before swap:");
        System.out.println("x value: " + x);
        System.out.println("y value: " + y);

        // swap numbers without using a temp variable
        
        x = x + y; // x is now the total
        
        y = x - y; // take total and subtract out original y, gives you x, then swap it to y
        
        x = x - y; // take total and subtract original x, gives you y, then swap it into x
        		   // the original x is now in the y variable
        
        System.out.println("After swap:");
        System.out.println("x value: " + x);
        System.out.println("y value: " + y);
    }
}