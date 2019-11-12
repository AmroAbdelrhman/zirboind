/*
 * Amro Abdelrhman
 * 08/11/2019
 * this program do something
 */

package secondunitsummative;

import java.util.Scanner;

/**
 *
 * @author AmAbd7808
 */
public class Secondunitsummative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner KeyedInput = new Scanner(System.in);
     int  level=0;
     int markl1 ;
     int markl1q1 ;
     int markl1q2 ;
     int markl1q3 ;
     int markl2 ;
     int markl2q1 ;
     int markl2q2 ;
     int markl2q3 ;
     int markl2q4 ;
     int markl3 ;
     int markl3q1 ;
     int markl3q2 ;
     int markl3q3 ;
     int markl3q4 ;
     int markl3q5 ;
     int percentl1;
     int percentl2;
     int percentl3 ;
     while (level != 4){
        System.out.println("________________anime quiz_____________");
        System.out.println("");
        System.out.println("please enter the level of hardness of your anime quiz");
        System.out.println("1.....level 1 ");
        System.out.println("2.....level 2");
        System.out.println("3.....level 3");
        System.out.println("4.....exit quiz");
        System.out.println("please enter your choice ");
        level=KeyedInput.nextInt();
        
        if (level == 1){
          int [ ] level1q = new int [3];  
            System.out.println("please answer these Questions");
            System.out.println("Question 1: How many episodes does onepiece have so far");
            System.out.println("Question 2: How many seasons is there in nanatsu no taizai");
            System.out.println("Question 3: How many seasons is there in Tokyo ghoul");
            System.out.println("");
            System.out.println("write the answers of the three question down here↓↓↓");
            level1q[0] = KeyedInput.nextInt();
            level1q[1] = KeyedInput.nextInt();
            level1q[2] = KeyedInput.nextInt();
            
            if (level1q[0] == 909){
                System.out.println("your Quistion 1 answer is correct");
                markl1q1 = 1 ;
            }
            else {
                System.out.println("your Quistion 1 answer is incorrect");
                markl1q1 = 0 ;
            }
            if (level1q[1] == 3){
                System.out.println("your Quistion 2 answer is correct");
                markl1q2 = 1 ;
            }
            else {
                System.out.println("your Quistion 2 answer is incorrect");
                markl1q2 = 0 ;
            }
            if (level1q[2] == 2){
                System.out.println("your Quistion 3 answer is correct");
                markl1q3 = 1 ;
            }
            else {
                System.out.println("your Quistion 3 answer is incorrect");
                markl1q3 = 0 ;
            }
            markl1 = markl1q1 + markl1q2 +markl1q3 ;
            percentl1 = (markl1/3)*100 ;
            if (markl1 == 3){
                System.out.println("very good it is the best");
            }
            else if (markl1 == 2){
                System.out.println("not bad but you can do better");
            }
            else if (markl1 <= 1){
                System.out.println("you kidding me ");
            }
            System.out.println("you finl mark is "+markl1+"/3 which means"+Math.round(percentl1)+"");
        }
            
        else if (level == 2){
            int [ ] level2q = new int [4];  
            System.out.println("please answer these Questions");
            System.out.println("Question 1: How many episodes does onepiece have so far");
            System.out.println("Question 2: How many seasons is there in nanatsu no taizai");
            System.out.println("Question 3: How many seasons is there in Tokyo ghoul");
            System.out.println("Question 4: How many episodes is there in Naruto shippuden");
            System.out.println("");
            System.out.println("write the answers of the three question down here↓↓↓");
            level2q[0] = KeyedInput.nextInt();
            level2q[1] = KeyedInput.nextInt();
            level2q[2] = KeyedInput.nextInt();
            level2q[3] = KeyedInput.nextInt();
            if (level2q[0] == 909){
                System.out.println("your Quistion 1 answer is correct");
                markl2q1 = 1 ;
            }
            else {
                System.out.println("your Quistion 1 answer is incorrect");
                markl2q1 = 0 ;
            }
            if (level2q[1] == 3){
                System.out.println("your Quistion 2 answer is correct");
                markl2q2 = 1 ;
            }
            else {
                System.out.println("your Quistion 2 answer is incorrect");
                markl2q2 = 0 ;
            }
            if (level2q[2] == 2){
                System.out.println("your Quistion 3 answer is correct");
                markl2q3 = 1 ;
            }
            else {
                System.out.println("your Quistion 3 answer is incorrect");
                markl2q3 = 0 ;
            }
            if (level2q[3] == 750){
                System.out.println("your Quistion 4 answer is correct");
                markl2q4 = 1 ;
            }
            else {
                System.out.println("your Quistion 4 answer is incorrect");
                markl2q4 = 0 ;
            }
            markl2 = markl2q1 + markl2q2 +markl2q3 + markl2q4;
            percentl2 = (markl2/4)*100 ;
            if (markl2 == 4){
                System.out.println("very good it is the best");
            }
            else if (markl2 == 3){
                System.out.println("you can do better");
            }
            else if (markl2 == 2){
                System.out.println("not bad ");
            }
            else if (markl2 == 1){
                System.out.println("you kidding me  ");
            }
            System.out.println("you finl mark is "+markl2+"/4 which means"+Math.round(percentl2)+"");
        }
        else if (level == 3){
            int [ ] level3q = new int [5]; 
            System.out.println("please answer these Questions");
            System.out.println("Question 1: How many episodes does onepiece have so far");
            System.out.println("Question 2: How many seasons is there in nanatsu no taizai");
            System.out.println("Question 3: How many seasons is there in Tokyo ghoul");
            System.out.println("Question 4: How many episodes is there in Naruto in all");
            System.out.println("Question 5: at what episode did naruto marry");
            System.out.println("");
            System.out.println("write the answers of the three question down here↓↓↓");
            level3q[0] = KeyedInput.nextInt();
            level3q[1] = KeyedInput.nextInt();
            level3q[2] = KeyedInput.nextInt();
            level3q[3] = KeyedInput.nextInt();
            level3q[4] = KeyedInput.nextInt();
            if (level3q[0] == 909){
                System.out.println("your Quistion 1 answer is correct");
                markl3q1 = 1 ;
            }
            else {
                System.out.println("your Quistion 1 answer is incorrect");
                markl3q1 = 0 ;
            }
            if (level3q[1] == 3){
                System.out.println("your Quistion 2 answer is correct");
                markl3q2 = 1 ;
            }
            else {
                System.out.println("your Quistion 2 answer is incorrect");
                markl3q2 = 0 ;
            }
            if (level3q[2] == 2){
                System.out.println("your Quistion 3 answer is correct");
                markl3q3 = 1 ;
            }
            else {
                System.out.println("your Quistion 3 answer is incorrect");
                markl3q3 = 0 ;
            }
            if (level3q[3] == 750){
                System.out.println("your Quistion 4 answer is correct");
                markl3q4 = 1 ;
            }
            else {
                System.out.println("your Quistion 4 answer is incorrect");
                markl3q4 = 0 ;
            }
            if (level3q[4] == 500){
                System.out.println("your Quistion 4 answer is correct");
                markl3q5 = 1 ;
            }
            else {
                System.out.println("your Quistion 4 answer is incorrect");
                markl3q5 = 0 ;
            }
            markl3 = markl3q1 + markl3q2 +markl3q3 + markl3q4 + markl3q5 ;
            percentl3 = (markl3/3)*100 ;
            if (markl3 == 5){
                System.out.println("very good it is the best");
            }
            else if (markl3 == 4){
                System.out.println("you can do better");
            }
            else if (markl3 == 3){
                System.out.println("not bad ");
            }
            else if (markl3 == 2){
                System.out.println("you kidding me  ");
            }
            else if (markl3 >= 1){
                System.out.println("go back to grade 1  ");
            }
            System.out.println("you finl mark is "+markl3+"/5 which means"+Math.round(percentl3)+"");
            }
            }
            if (level == 4){
            System.out.println("byebye");
            
         
          
        }
     }
    }
    
     


