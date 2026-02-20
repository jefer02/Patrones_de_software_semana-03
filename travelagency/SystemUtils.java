package travelagency;

// Utilidades del sistema
public class SystemUtils {
    
    public static void printLine() {
        System.out.println("=======================================");
    }
    
    public static void printError(String msg) {
        System.out.println("ERROR: " + msg);
    }
    
    public static void printSuccess(String msg) {
        System.out.println("✓ " + msg);
    }
}
