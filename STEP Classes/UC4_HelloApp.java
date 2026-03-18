public class UC4_HelloApp {
    public static void main(String[] args) {
        String greeting;
        
        // Check if command-line arguments were provided
        if (args.length > 0) {
            // Join all names with commas and spaces using String.join()
            String names = String.join(", ", args);
            greeting = "Hello, " + names + "!";
        } else {
            // Default greeting if no arguments provided
            greeting = "Hello, World!";
        }
        
        System.out.println(greeting);
    }
}