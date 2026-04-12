public class HelloApp {
    public static void main(String[] args) {

        // Case 1: No arguments → Default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Join all arguments with delimiter
        String names = String.join(", ", args);

        // Print final greeting
        System.out.println("Hello, " + names + "!");
    }
}