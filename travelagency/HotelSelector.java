package travelagency;

// Selector de hoteles
public class HotelSelector {
    
    public static void showHotels() {
        System.out.println("\n// Hoteles disponibles:");
        System.out.println("1. ECO_LODGE");
        System.out.println("2. CAMPING");
        System.out.println("3. HOSTEL");
        System.out.println("4. HOTEL_NORMAL");
    }
    
    public static String getHotel(int option) {
        switch (option) {
            case 1: return "ECO_LODGE";
            case 2: return "CAMPING";
            case 3: return "HOSTEL";
            case 4: return "HOTEL_NORMAL";
            default:
                System.out.println("ERROR: Hotel no valido");
                return "HOTEL_NORMAL";
        }
    }
}
