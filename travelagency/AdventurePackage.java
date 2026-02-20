package travelagency;

import java.util.ArrayList;

// La clase principal del paquete de aventura
public class AdventurePackage implements TravelPackageInterface {
    
    private String destination;
    private int dias;
    private String hotelType;
    private String transportType;
    private int price_total;
    private ArrayList<String> actividades;
    
    public AdventurePackage() {
        System.out.println("// Iniciando paquete...");
        this.actividades = new ArrayList<String>();
    }
    
    // getters y setters
    public String getDestination() {
        return destination;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public int getDias() {
        return dias;
    }
    
    public void setDias(int dias) {
        this.dias = dias;
    }
    
    public String getHotelType() {
        return hotelType;
    }
    
    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }
    
    public String getTransportType() {
        return transportType;
    }
    
    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }
    
    public int getPrice() {
        return price_total;
    }
    
    public void setPrice(int price_total) {
        this.price_total = price_total;
    }
    
    public ArrayList<String> getActividades() {
        return actividades;
    }
    
    public void addActividad(String actividad) {
        this.actividades.add(actividad);
        System.out.println("// Actividad agregada: " + actividad);
    }
    
    @Override
    public void showInfo() {
        System.out.println("\n========= PAQUETE DE AVENTURA =========");
        System.out.println("Destino: " + destination);
        System.out.println("Dias: " + dias);
        System.out.println("Hotel: " + hotelType);
        System.out.println("Transporte: " + transportType);
        System.out.println("Precio: $" + price_total);
        System.out.println("Actividades: ");
        for (String act : actividades) {
            System.out.println("  - " + act);
        }
        System.out.println("=====================================\n");
    }
    
    @Override
    // este es el método clave para el Prototype Pattern
    public TravelPackageInterface makeCopy() {
        System.out.println("// Aqui clonamos el paquete...");
        AdventurePackage clonado = new AdventurePackage();
        clonado.destination = this.destination;
        clonado.dias = this.dias;
        clonado.hotelType = this.hotelType;
        clonado.transportType = this.transportType;
        clonado.price_total = this.price_total;
        
        // copiamos actividades
        for (String act : this.actividades) {
            clonado.actividades.add(act);
        }
        
        System.out.println("// Clonacion completada wow!!");
        return clonado;
    }
}
