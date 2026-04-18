// HelloApp.java
// UC4: Display multiple names or default "World"

public class HelloApp {

    public static void main(String[] args) {

        // Variable to store names
        String name;

        // Check if arguments are passed
        if (args.length == 0) {
            // Default value
            name = "World";
        } else {
            // Build names using StringBuilder
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                // Add comma except for last name
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();
        }

        // Print output
        System.out.println("Hello, " + name + "!");
    }
}