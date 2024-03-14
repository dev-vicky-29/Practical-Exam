import java.util.Scanner;
public class a17 {
    public static void main(String[] args)
     {
        int number, originalNumber, remainder, result = 0, n = 0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter any Number: ");
	number=sc.nextInt();
	originalNumber = number;
        for (;originalNumber != 0; originalNumber /= 10)
        {
            n++;
        }
        originalNumber = number;
        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }
        if(result == number)
            System.out.println(number + " is an Armstrong Number");
else
            System.out.println(number + " is not an Armstrong Number.");
    }
}
