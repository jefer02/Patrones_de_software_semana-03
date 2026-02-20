package travelagency;

// Clase para calcular precios (aunque no hace mucho)
public class PriceCalculator {
    
    public static int calculatePrice(int dias, int hotel_multiplier, int activities_cost) {
        System.out.println("// Calculando precio...");
        int base = dias * 100;
        int hotel_cost = hotel_multiplier * 50;
        int total = base + hotel_cost + activities_cost;
        System.out.println("// Precio calculado: " + total);
        return total;
    }
    
    public static int getHotelMultiplier(String hotel_type) {
        if (hotel_type.equals("ECO_LODGE")) {
            return 1;
        } else if (hotel_type.equals("CAMPING")) {
            return 1;
        } else if (hotel_type.equals("HOSTEL")) {
            return 2;
        } else {
            return 3;
        }
    }
}
