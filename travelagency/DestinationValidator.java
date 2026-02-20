package travelagency;

// Valida destinos (muy basico)
public class DestinationValidator {
    
    public static boolean isValidDestination(String dest) {
        System.out.println("// Validando destino: " + dest);
        if (dest == null || dest.length() < 2) {
            System.out.println("ERROR: Destino invalido");
            return false;
        }
        return true;
    }
}
