import java.util.*;   
class Palindrome  
{  
   public static void main(String args[])  
   {  
      String original, reverse = "";   
      try (Scanner in = new Scanner(System.in)) {
        System.out.println("Enter a number ");  
          original = in.nextLine();
    }   
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
      if (original.equals(reverse))  
         System.out.println("Entered number is a palindrome.");  
      else  
         System.out.println("Entered number isn't a palindrome.");   
   }  
}  