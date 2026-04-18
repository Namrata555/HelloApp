public class HelloApp {

    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            // StringBuilder to build names
            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop to add names
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing comma and space using substring
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            // Print final greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}