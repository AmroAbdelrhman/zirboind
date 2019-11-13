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
     int [ ] markl = new int [3]; 
     int [ ] percentl = new int [3];  
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
            System.out.print("Question 1 Ans:");
            level1q[0] = KeyedInput.nextInt();
            System.out.print("Question 2 Ans:");
            level1q[1] = KeyedInput.nextInt();
            System.out.print("Question 3 Ans:");
            level1q[2] = KeyedInput.nextInt();
          int [ ] markl1q = new int [3];
            if (level1q[0] == 909){
                System.out.println("your Quistion 1 answer is correct");
                markl1q[0] = 1 ;
            }
            else {
                System.out.println("your Quistion 1 answer is incorrect");
                markl1q[0] = 0 ;
            }
            if (level1q[1] == 3){
                System.out.println("your Quistion 2 answer is correct");
                markl1q[1] = 1 ;
            }
            else {
                System.out.println("your Quistion 2 answer is incorrect");
                markl1q[1] = 0 ;
            }
            if (level1q[2] == 2){
                System.out.println("your Quistion 3 answer is correct");
                markl1q[2] = 1 ;
            }
            else {
                System.out.println("your Quistion 3 answer is incorrect");
                markl1q[2] = 0 ;
            }
            markl[0] = markl1q[0] + markl1q[1] +markl1q[2] ;
            percentl[0] = (markl[0]/3)*100 ;
            if (markl[0] == 3){
                System.out.println("very good it is the best");
            }
            else if (markl[0] == 2){
                System.out.println("not bad but you can do better");
            }
            else if (markl[0] <= 1){
                System.out.println("you kidding me ");
            }
            System.out.println("you finl mark is "+markl[0]+"/3 which means"+Math.round(percentl[0])+"%");
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
            System.out.print("Question 1 Ans:");
            level2q[0] = KeyedInput.nextInt();
            System.out.print("Question 2 Ans:");
            level2q[1] = KeyedInput.nextInt();
            System.out.print("Question 3 Ans:");
            level2q[2] = KeyedInput.nextInt();
            System.out.print("Question 4 Ans:");
            level2q[3] = KeyedInput.nextInt();
            int [ ] markl2q = new int [4];  
            if (level2q[0] == 909){
                System.out.println("your Quistion 1 answer is correct");
                markl2q[0] = 1 ;
            }
            else {
                System.out.println("your Quistion 1 answer is incorrect");
                markl2q[0] = 0 ;
            }
            if (level2q[1] == 3){
                System.out.println("your Quistion 2 answer is correct");
                markl2q[1] = 1 ;
            }
            else {
                System.out.println("your Quistion 2 answer is incorrect");
                markl2q[1] = 0 ;
            }
            if (level2q[2] == 2){
                System.out.println("your Quistion 3 answer is correct");
                markl2q[2] = 1 ;
            }
            else {
                System.out.println("your Quistion 3 answer is incorrect");
                markl2q[2] = 0 ;
            }
            if (level2q[3] == 750){
                System.out.println("your Quistion 4 answer is correct");
                markl2q[3] = 1 ;
            }
            else {
                System.out.println("your Quistion 4 answer is incorrect");
                markl2q[3] = 0 ;
            }
            markl[1] = markl2q[0] + markl2q[1] +markl2q[2] + markl2q[3];
            percentl[1] = (markl[1]/4)*100 ;
            if (markl[1] == 4){
                System.out.println("very good it is the best");
            }
            else if (markl[1] == 3){
                System.out.println("you can do better");
            }
            else if (markl[1] == 2){
                System.out.println("not bad ");
            }
            else if (markl[1] == 1){
                System.out.println("you kidding me  ");
            }
            System.out.println("you finl mark is "+markl[1]+"/4 which means"+Math.round(percentl[1])+"%");
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
            System.out.print("Question 1 Ans:");
            level3q[0] = KeyedInput.nextInt();
            System.out.print("Question 2 Ans:");
            level3q[1] = KeyedInput.nextInt();
            System.out.print("Question 3 Ans:");
            level3q[2] = KeyedInput.nextInt();
            System.out.print("Question 4 Ans:");
            level3q[3] = KeyedInput.nextInt();
            System.out.print("Question 5 Ans:");
            level3q[4] = KeyedInput.nextInt();
            int [ ] markl3q = new int [5]; 
            if (level3q[0] == 909){
                System.out.println("your Quistion 1 answer is correct");
                markl3q[0] = 1 ;
            }
            else {
                System.out.println("your Quistion 1 answer is incorrect");
                markl3q[0] = 0 ;
            }
            if (level3q[1] == 3){
                System.out.println("your Quistion 2 answer is correct");
                markl3q[1] = 1 ;
            }
            else {
                System.out.println("your Quistion 2 answer is incorrect");
                markl3q[1] = 0 ;
            }
            if (level3q[2] == 2){
                System.out.println("your Quistion 3 answer is correct");
                markl3q[2] = 1 ;
            }
            else {
                System.out.println("your Quistion 3 answer is incorrect");
                markl3q[2] = 0 ;
            }
            if (level3q[3] == 750){
                System.out.println("your Quistion 4 answer is correct");
                markl3q[3] = 1 ;
            }
            else {
                System.out.println("your Quistion 4 answer is incorrect");
                markl3q[3] = 0 ;
            }
            if (level3q[4] == 500){
                System.out.println("your Quistion 4 answer is correct");
                markl3q[4] = 1 ;
            }
            else {
                System.out.println("your Quistion 4 answer is incorrect");
                markl3q[4] = 0 ;
            }
            markl[2] = markl3q[0] + markl3q[1] +markl3q[2] + markl3q[3] + markl3q[4] ;
            percentl[2] = (markl[2]/3)*100 ;
            if (markl[2] == 5){
                System.out.println("very good it is the best");
            }
            else if (markl[2] == 4){
                System.out.println("you can do better");
            }
            else if (markl[2] == 3){
                System.out.println("not bad ");
            }
            else if (markl[2] == 2){
                System.out.println("you kidding me  ");
            }
            else if (markl[2] >= 1){
                System.out.println("go back to grade 1  ");
            }
            System.out.println("you finl mark is "+markl[2]+"/5 which means"+Math.round(percentl[2])+"%");
            }
            if (level == 4){
            System.out.println("byebye");
            }
     }
    }
}

     


