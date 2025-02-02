package example;

/**
 * Hello world!
 */
public class App {
    /**
     * Main method - entry point of the application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    /**
     * Returns a greeting message
     * @param name the name to greet
     * @return greeting message
     */
    public String getGreeting(String name) {
        return "Hello, " + name + "!";
    }
    
    /**
     * Returns the current version of the application
     * @return version string
     */
    public String getVersion() {
        return "1.0.0";
    }
}
