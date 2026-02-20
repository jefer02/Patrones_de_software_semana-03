package travelagency;

import java.util.HashMap;
import java.util.Set;

// Gestor de paquetes y prototipos
public class PackageManager {
    
    private HashMap<String, AdventurePackage> prototipos;
    
    public PackageManager() {
        System.out.println("// Creando PackageManager...");
        this.prototipos = new HashMap<String, AdventurePackage>();
    }
    
    public void addPrototype(String nombre, AdventurePackage paquete) {
        System.out.println("// Agregando prototipo: " + nombre);
        prototipos.put(nombre, paquete);
    }
    
    public AdventurePackage getClonedPackage(String nombre) {
        System.out.println("// Obteniendo clon de: " + nombre);
        if (prototipos.containsKey(nombre)) {
            return (AdventurePackage) prototipos.get(nombre).makeCopy();
        } else {
            System.out.println("ERROR: Paquete no encontrado");
            return null;
        }
    }
    
    public void showAllPrototypes() {
        System.out.println("\n========= PAQUETES DISPONIBLES =========");
        Set<String> keys = prototipos.keySet();
        for (String key : keys) {
            System.out.println("- " + key);
        }
        System.out.println("=======================================\n");
    }
    
    public void showAllPackagesInfo() {
        System.out.println("\n========= INFO DE TODOS LOS PAQUETES =========");
        Set<String> keys = prototipos.keySet();
        for (String key : keys) {
            System.out.println("\nPaquete: " + key);
            prototipos.get(key).showInfo();
        }
        System.out.println("============================================\n");
    }
}
