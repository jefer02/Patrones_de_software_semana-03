package travelagency;

// Interface para los paquetes de viaje
public interface TravelPackageInterface {
    void showInfo();
    
    // este es el metodo del prototype pattern
    TravelPackageInterface makeCopy();
}
