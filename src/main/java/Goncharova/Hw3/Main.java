package Goncharova.Hw3;

import java.util.Random;

public class Main {

   static Random random = new Random();


   public static void main (String[] args) {
      Game1();
   }

   public static boolean Game1() {
      int number = 0;
      for(int i = 0; i < 3; i++){
         number = random.nextInt(9);
         System.out.println(number);
      }





      return false;
   }
}
