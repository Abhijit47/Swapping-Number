import java.util.*;

public class swap {
    public static void main(String args[]){
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Swap Two Number without Using Third Variable");
        System.out.print("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println(" ");
        System.out.print("Enter the value of y: ");
        y = sc.nextInt();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Before Swapping Number: "+x+" "+y);
        System.out.println(" ");
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.print("After Swapping Number: "+x+" "+y);
        
    }

    

}