package moron;

import java.util.Random;
import java.util.Scanner;

public class MorraMain {

    private static void play(){
        System.out.println("Udv a Morra jatekban!");
        System.out.println("Jatek leirasa: Szamokat kerunk be toled es geptol amik 1 vagy 2 lehet es ha a szamok osszege paros akkor te nyertel de ha paratlan akkor a gep nyert, a nyert pontok a megadott szamok osszege!");
        int humanPont=0, computerPont=0, numberSum=0;
        int humanNumber,computerNumber, folytatas=0;

        while(folytatas!=1){
            humanNumber=humanBeker();
            computerNumber = computerBeker();

            if((humanNumber+computerNumber)%2==0){
                numberSum = humanNumber + computerNumber;
                humanPont += numberSum;
                System.out.println("A játék tippje "+computerNumber+" igy a human nyert! Jelen allas:");
                System.out.println("Gep pontja: "+computerPont);
                System.out.println("Human pontja: "+humanPont);
            }
            else{
                numberSum = humanNumber + computerNumber;
                computerPont += numberSum;
                System.out.println("A játék tippje "+computerNumber+" igy a gep nyert! Jelen allas: ");
                System.out.println("Gep pontja: "+computerPont);
                System.out.println("Human pontja: "+humanPont);
            }

            folytatas=bekerFoly();

        }
        System.out.println("Jatek VEGE!, és akkor a jatek eredmenye:");
        System.out.println("Gep pontja: "+computerPont);
        System.out.println("Human pontja: "+humanPont);
    }
     private static int humanBeker(){
         Scanner myObj = new Scanner(System.in);
         int number = 0;
         while(true){
             System.out.println("Kerem a Szamodat :");
             number = myObj.nextInt();
             System.out.println(number);
             if (number == 1 || number == 2) {
                 break;
             } else {
                 System.err.println("Mivel rossz lepes volt. Probald ujra!");
             }
         }
         return number;
     }
     private static int computerBeker(){
         double probability  = new Random().nextDouble();
         int number;
         if(probability <= 0.75){
             number = 1;
         }
         else{
             number = 2;
         }

         return number;
     }
     private static int bekerFoly(){
         int answer;
         Scanner myObj = new Scanner(System.in);
         System.out.println("Akarja e folytatni?: i/n");
         while(true){
             String c = myObj.next();
             if(c.equals("i")){
                 answer = 0;
                 break;
             }
             else if(c.equals("n")){
                 answer = 1;
                 break;
             }
             else{
                 System.err.println("Mivel rossz megadas volt. Probald ujra!");
             }
         }

         return answer;
     }

    public static void main(String[] args) {
       play();
    }
}
