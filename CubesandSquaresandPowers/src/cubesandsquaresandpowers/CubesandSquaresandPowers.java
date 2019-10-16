/*
 * Amro Abdelrhman
 * 10/10/2019
 * this program do something 
 */

package cubesandsquaresandpowers;
import java.util.Scanner;
/**
 *
 * @author amabd7808
 */
public class CubesandSquaresandPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner KeyedInput = new Scanner(System.in);
    int choice=0;
    double base;
    double Ans;
    double power;
    while (choice != 4){
        System.out.println("________________cubes and squares and powers_____________");
        System.out.println("");
        System.out.println("please enter your choice");
        System.out.println("1.....Find the value of a number squared ");
        System.out.println("2.....Find the value of a number cubed");
        System.out.println("3.....Find the value of a number, to any power");
        System.out.println("4.....Exit");
        System.out.println("please enter your choice ");
        choice=KeyedInput.nextInt();
        if (choice == 1){
            System.out.println("please Enter the base");
            base=KeyedInput.nextInt();
            System.out.println("your base is "+base+"");
            Ans = base * base;
            System.out.println(" your Answer is "+Ans+"");
            System.out.println("_____________________________________________________________");
            }
        else if (choice == 2){
            System.out.println("please Enter the base");
            base=KeyedInput.nextInt();
            System.out.println("your base is "+base+"");
            Ans = base * base * base;
            System.out.println(" your Answer is "+Ans+"");
            System.out.println("_____________________________________________________________");
            }
        else if (choice == 3){
            System.out.println("please Enter the base");    
            base=KeyedInput.nextInt();
            System.out.println("your base is "+base+"");
            System.out.println("please enter your power");
            power=KeyedInput.nextInt();
            System.out.println("your power is "+power+"");
            double num1 = 0;
            double Anss = 1; 
            while (num1 <= power) 
            {
                Anss = Anss * base;
                num1 = num1 + 1;
            }
            System.out.println(" your Answer is "+Anss+""); 
            System.out.println("_____________________________________________________________");
        }
    }
       if (choice == 4 ){
           System.out.println("so u actcually clicked on number 4 well this means exit you think I am going to be like thank you have a great day no you better get out of here before I kick your ass");
       }
    
      
}
