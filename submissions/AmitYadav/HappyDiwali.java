

public class HappyDiwali {
    public static void main(String[] args) throws InterruptedException {
        // ANSI color codes for console (works in most terminals)
        final String RESET = "\u001B[0m";
        final String YELLOW = "\u001B[33m";
        final String RED = "\u001B[31m";
        final String PURPLE = "\u001B[35m";

        // Diwali greeting
        String greeting = RED + "🎇🎆 Happy Diwali! 🎆🎇" + RESET;

        // Decorative border
        String border = PURPLE + "*****************************" + RESET;

        // Print border
        System.out.println(border);

        // Print greeting with slight delay for effect
        for (char c : greeting.toCharArray()) {
            System.out.print(c);
            Thread.sleep(100); // 100ms delay
        }
        System.out.println("\n" + border);

        // Print multiple diyas using loops
        for (int i = 1; i <= 3; i++) {
            printDiya(YELLOW);
            Thread.sleep(200); // 200ms pause between diyas
        }

        // Closing message
        System.out.println("\n" + RED + "Keep coding and shining bright! 🪔" + RESET);
    }

    // Method to print a single diya
    public static void printDiya(String color) {
        String[] diya = {
                "   " + color + "🪔" + "",
                "  " + color + "***",
                " " + color + "*****",
                color + "*******",
                " " + color + "*****",
                "  " + color + "***",
                "   " + color + "*"
        };

        for (String line : diya) {
            System.out.println(line);
        }
        System.out.println(); // Empty line after diya
    }
}
