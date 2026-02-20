package travelagency;

import java.util.Scanner;

// Lee inputs del usuario
public class UserInputReader {
    
    private Scanner scanner;
    
    public UserInputReader() {
        System.out.println("// Creando reader...");
        this.scanner = new Scanner(System.in);
    }
    
    public int readInt() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("ERROR: Invalid input");
            scanner.nextLine(); // limpiar buffer
            return 0;
        }
    }
    
    public String readString() {
        scanner.nextLine(); // limpiar buffer anterior
        return scanner.nextLine();
    }
    
    public void close() {
        scanner.close();
    }
}
