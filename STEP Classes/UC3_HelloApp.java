public class UC3_HelloApp {
    public static void main(String[] args) {
        // Use ternary operator to assign name based on argument availability
        String name = (args.length > 0) ? args[0] : "World";
        
        System.out.println("Hello, " + name + "!");
    }
}