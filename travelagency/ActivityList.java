package travelagency;

// Lista de actividades predefinidas
public class ActivityList {
    
    public static String[] getActivities() {
        String[] activities = {
            "Senderismo en montaña",
            "Kayak en rio",
            "Escalada en roca",
            "Camping bajo las estrellas",
            "Safari fotografico",
            "Buceo en cenote",
            "Ciclismo de montana"
        };
        return activities;
    }
    
    public static void showActivities() {
        System.out.println("\n// Actividades disponibles:");
        String[] acts = getActivities();
        for (int i = 0; i < acts.length; i++) {
            System.out.println((i + 1) + ". " + acts[i]);
        }
    }
}
