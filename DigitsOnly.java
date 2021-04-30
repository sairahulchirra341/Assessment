import java.util.Scanner;
public class DigitsOnly {

 public static void main(String[] args) {

  Scanner input=new Scanner(System.in);
  System.out.println("Enter string:");
  String str = input.nextLine();
  System.out.println("Given string contains only digits : " + checkStringOnlyDigitsWithRange(str));  
 }
 private static boolean checkStringOnlyDigitsWithRange(String input) {

  for (int i = 0; i < input.length(); i++) {
   int digit = (int) input.charAt(i);
   if (!(digit >= 49 && digit <= 57)) {
    return false;
   }
  }
  return true;
 }

}


Output1:
Enter string:
12345
Given string contains only digits : true

Output2:
Enter string:
a12b
Given string contains only digits : false
D:\
