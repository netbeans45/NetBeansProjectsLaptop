import java.util.Scanner;
public class NewClass{
  public static void main(String[] args)  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a credit card number as a string: ");
   // String number = input.nextLine();
    //int length = getSize(number);
    if (isValid(number))
      System.out.println(number + " is valid");
    else
      System.out.println(number + " is invalid");}
  public static boolean isValid(String number)  {
    return ((number.startsWith("4")) || 

(number.startsWith("5")) || 
      (number.startsWith("6")) || 

(number.startsWith("37"))) && 
      ((sumOfDoubleEvenPlace(number) + 

sumOfOddPlace(number)) % 10 == 0); }
  public static int sumOfDoubleEvenPlace(String cardNumber)  {
    int result = 0;
    for (int i = cardNumber.length() - 2; i >= 0; i -= 2)    {
      result = result + getDigit(Integer.parseInt(cardNumber.charAt(i)) * 2);
    
    
    }
    return result;
  }//end of sumOfDoubleEvenPlace method
  public static int getDigit(int number)  {
    return number % 10 + number / 10 % 10;
  }
  public static int sumOfOddPlace(String cardNumber)  {
    int result = 0;
    for (int i = cardNumber.length() - 1; i >= 0; i -= 2) {result += Integer.parseInt(cardNumber.charAt(i));
    }
    return result;
  }//end sumofoddplace method
  public static boolean prefixMatched();{
    
    return;
}//End of prefixMatched method
  public static int getSize(long d);{
  String cardNumberStr = Long.toString(d);
  int length = cardNumberStr.length();
  return length; 
}//End of getSize method
}//end of class 