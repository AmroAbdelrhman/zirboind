/*
 * Amro Abdelrhman
 * 09/10/2019
 * this program do something
 */

package loop;
import java.util.Scanner;
/**
 *
 * @author amabd7808
 */
public class Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner KeyedInput = new Scanner(System.in);
    
    int choice=0;
        System.out.println("_____cool counting program______");
        System.out.println("");
        System.out.println("please enter your choice");
        System.out.println("1.....count from 0 to 10 by 1");
        System.out.println("2.....count from 100 to 0 by 10");
        System.out.println("3.....count from 50 to 500 by 50");
        System.out.println("4.....cout from 6000 to 1000 by 1000");
        System.out.println("please enter your choice ");
        
        choice=KeyedInput.nextInt();
        
        System.out.println("");
        System.out.println("---------------------------------------------------");
        
        if (choice == 1){
            System.out.println("you have chosen to count from 0 to 10 by 1");
            for (int i = 0; i <= 10; i = i+1)
            {
            System.out.println(i);
            }
            }
        else if (choice == 2){
            System.out.println("you have chosen to count from 100 to 0 by 10");
            for (int i = 0; i <= 100; i = i+10)
            {
                System.out.println(i);
            }
            }
        else if (choice == 3){
            System.out.println("you have chosen to count from 50 to 500 by 50");
            for (int i = 50; i <= 500; i = i+50)
            {
                System.out.println(i);
            }
            }
        else if (choice == 4){
            System.out.println("you have chosen to from 6000 to 1000 by 1000");
            for (int i = 6000; i >= 1000; i = i-1000)
            {
                System.out.println(i);
            }
            }
    }
