import java.util.Random;


public class Passwords {

   public static void main(String [] args){
   
      Random rand = new Random();
      
      String password = "";

      password = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz)!@#$%^&*(";
      
      System.out.println("Your temporary passwords are: ");
      
      for (int i = 0; i < 8; i ++){
         System.out.println();
         for (int j = 0; j < 10; j++)
            System.out.print(password.charAt(rand.nextInt(72)));
         
      }//end outer-loop
      

   
   }//end main



}//end class passwords