import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class GradeStats {

   public static void main(String [] args)throws IOException {
   
      File infile = new File ("grades.txt");
      Scanner scan = new Scanner(infile);
      
      //variables
      double grade = 0.0,
             sum = 0.0,
             average = 0.0,
             max = 0.0,
             min = 0.0;
      int count = 0;

      //method
      processGrades(scan);

      scan.close();
   
   
   }//end main

   public static void processGrades(Scanner scan) throws IOException { // to determine letter value
      double grade = 0.0,
             sum = 0.0,
             average = 0.0,
             max = Integer.MIN_VALUE,
             min = 0;
      int count = 0,
          countA = 0,
          countB = 0,
          countC = 0,
          countD = 0,
          countF = 0;
      
      while (scan.hasNext()){
         grade = Double.parseDouble(scan.nextLine());
         min = grade;
         count++;
         
         //if-statements to get max and min values
         if (grade > max){
            max = grade;
         }
         
         if (grade < min){
            //grade = min;
         }
         
         sum += grade;
         

         //if-statements to determine the letter grade.
         if (grade >= 90){
            countA++;
         }
         else if (grade >= 80){
            countB++;
         }
         else if (grade >= 70){
            countC++;
         }     
         else if (grade >= 60){
            countD++;
         } 
         else if (grade < 60){
            countF++;
         }
       
       }//end while 
      
      //output
      System.out.println("\nThe Total Number of Grades: " + count);
      System.out.println("\nNumber of A's: " + countA);
      System.out.println("Number of B's: " + countB);
      System.out.println("Number of C's: " + countC);
      System.out.println("Number of D's: " + countD);
      System.out.println("Number of F's: " + countF);
      
      
      System.out.printf("\nOverall Average Grade: %.1f" , (sum / count));
      System.out.println("\nLowest Grade: " + min);
      System.out.println("Highest Grade: " + max);
   
   
   }//end processGrades
   


}//end class GradeStats