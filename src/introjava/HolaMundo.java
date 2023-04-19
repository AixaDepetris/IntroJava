package introjava;

import java.util.Scanner;

public class HolaMundo {
    
  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        String nombre;
        int edad;
        
        System.out.println("Ingresa tu nombre");
        nombre = leer.nextLine();
        
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();
        
        System.out.println("Hola mi nombre es "+nombre+" y mi edad es "+edad+".");
    }
    
}
