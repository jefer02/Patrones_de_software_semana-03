package travelagency;

// Clase para mostrar mensajes de bienvenida
public class WelcomeMessage {
    
    public static void showWelcome() {
        System.out.println("\n==========================================");
        System.out.println("  Welcome to Oscar Travel Adventure!!  ");
        System.out.println("==========================================\n");
    }
    
    public static void showMenu() {
        System.out.println("1. seee all packages");
        System.out.println("2. Create new package");
        System.out.println("3. clone a package");
        System.out.println("4. exit");
        System.out.print("Choose number: ");
    }
}
