class TestJavaCommandLine {

    public static void main(String[] args) {
        // Check for command line arguments
        if (args.length > 0) {
            System.out.println("The command line arguments are:");
            
            // Iterating the args array and printing the command line arguments
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "]: " + args[i]);
            }
        } else {
            System.out.println("No command line arguments found.");
        }
    }
}
