import java.util.Scanner;
public class import java.util.Scanner;
public class a15
{
static void checkPalindrome(String input) 
{
boolean res = true;
int length = input.length();
for(int i=0; i<= length/2; i++) 
{
if(input.charAt(i) != input.charAt(length-i-1)) 
{
res = false;
break;
}
}
System.out.println(input + " is Palindrome = "+res);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter your Statement: ");
String str = sc.nextLine();
checkPalindrome(str);
}
}

{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Number:");
    int num = sc.nextInt();
    int factorial = fact(num);
    System.out.println("Factorial Of Entered Number is: "+factorial);
  }
    static int fact(int n)
{
int output;
if(n==1){
return 1;
}
output = fact(n-1)* n;
return output;
}
}
