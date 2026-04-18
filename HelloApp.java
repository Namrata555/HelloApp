class HelloApp {
    public static void main(String[] args) {

        // Default value
        String name = "World";

        // Check if user provided input
        if (args.length > 0) {
            name = args[0];
        }

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}