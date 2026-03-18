public class UC5_HelloApp {
    public static void main(String[] args) {
        String greeting;
        if (args.length == 0) {
            greeting = "Hello, World!";
        } else {
            StringBuilder namesBuilder = new StringBuilder();
            for (String name : args) {
                if (namesBuilder.length() > 0) {
                    namesBuilder.append(", ");
                }
                namesBuilder.append(name);
            }
            greeting = "Hello, " + namesBuilder.toString() + "!";
        }
        System.out.println(greeting);
    }
}