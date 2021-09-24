
package armstrong_number;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Mohamed amin
 */
public class ArmStrong_Number {

    public static void main(String[] args) {

 int start_digit;
 int end_digit;
 int Num_digits;
 int middle_Nums;
 
  Scanner input = new Scanner(System.in);
  Random rand = new Random();
  
  System.out.println(" How many digits does the Number hold :- ");
  Num_digits = input.nextInt();
  
  for(int i=0; i<= Num_digits; i++){
      
      
        for(middle_Nums=0; middle_Nums < Num_digits; middle_Nums++){

        System.out.println(" Enter the strating digit of the number :- ");
        start_digit = input.nextInt();
        
        System.out.println(" Enter the last digit of the number :- ");
        end_digit = input.nextInt();
   
        middle_Nums = rand.nextInt();
        
       System.out.print(start_digit);
       System.out.print(middle_Nums);
       System.out.println(end_digit);

  }

  }


    }
    
}
