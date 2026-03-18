public class UC6_HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments provided.");
            return;
        }
        StringBuilder greeting = new StringBuilder("Hello");
        for (String name : args) {
            greeting.append(", ").append(name);
        }
        // Remove trailing delimiter
        String result = greeting.substring(0, greeting.length() - 2);
        System.out.println(result);
    }
}