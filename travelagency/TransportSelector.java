package travelagency;

// Selector de transporte
public class TransportSelector {
    
    public static void showTransports() {
        System.out.println("\n// Transportes disponibles:");
        System.out.println("1. BUS");
        System.out.println("2. BIKE");
        System.out.println("3. JEEP");
        System.out.println("4. WALK");
    }
    
    public static String getTransport(int option) {
        switch (option) {
            case 1: return "BUS";
            case 2: return "BIKE";
            case 3: return "JEEP";
            case 4: return "WALK";
            default:
                System.out.println("ERROR: Transporte no valido");
                return "BUS";
        }
    }
}
