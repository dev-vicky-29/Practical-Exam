// Java program to demonstrate user defined exception
// This program throws an exception whenever balance amount is below Rs 1000
class TestJavaEH4 extends Exception {
    //store account information
    private static int accno[] = {1001, 1002, 1003, 1004, 1005};
    private static String name[] =
                 {"Nish", "Shubh", "Sush", "Abhi", "Akash"};
    private static double bal[] =
         {10000.00, 12000.00, 5600.0, 999.00, 1100.55};
    // default constructor
    TestJavaEH4() {    }
    // parametrized constructor
    TestJavaEH4 (String str) { super(str); }
    // write main()
    public static void main(String[] args)  {
        try  {
            // display the heading for the table
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
            // display the actual account information
            for (int i = 0; i < 5 ; i++)
            {
                System.out.println(accno[i] + "\t" + name[i] + "\t" + bal[i]);
                // display own exception if balance < 1000
                if (bal[i] < 1000)
                {
                    TestJavaEH4 me =new TestJavaEH4 ("Balance is less than 1000");
                    throw me;
                }
            }
        } //end of try
        catch (TestJavaEH4 e) {
            e.printStackTrace();
        }
    }
}
