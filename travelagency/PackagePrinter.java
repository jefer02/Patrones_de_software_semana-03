package travelagency;

// Clase para imprimir paquetes bonito
public class PackagePrinter {
    
    public static void printPackage(AdventurePackage pkg) {
        System.out.println("\n╔════════════════════════════════════╗");
        System.out.println("║   PAQUETE DE AVENTURA INCREIBLE   ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println("Destino: " + pkg.getDestination());
        System.out.println("Duracion: " + pkg.getDias() + " dias");
        System.out.println("Hotel: " + pkg.getHotelType());
        System.out.println("Transporte: " + pkg.getTransportType());
        System.out.println("Precio Total: $" + pkg.getPrice());
        System.out.println("\nActividades:");
        for (String act : pkg.getActividades()) {
            System.out.println("  ✓ " + act);
        }
        System.out.println();
    }
}
