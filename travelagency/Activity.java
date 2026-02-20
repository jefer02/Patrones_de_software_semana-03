package travelagency;

// Clase para actividades en el paquete
public class Activity {
    
    private String activity_name;
    private int precio_activity;
    
    public Activity(String activity_name, int precio_activity) {
        System.out.println("// Creando aktividad: " + activity_name);
        this.activity_name = activity_name;
        this.precio_activity = precio_activity;
    }
    
    public String getActivityName() {
        return this.activity_name;
    }
    
    public int getActivityPrice() {
        return this.precio_activity;
    }
    
    @Override
    public String toString() {
        return activity_name + " ($" + precio_activity + ")";
    }
}
