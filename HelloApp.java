class HelloApp {
    public static void main(String[] args) {

        // Check if no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            // StringBuilder to build names
            StringBuilder names = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }

            // Print final greeting
            System.out.println("Hello, " + names + "!");
        }
    }
}