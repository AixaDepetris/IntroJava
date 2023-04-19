package guía_01;

import java.util.Scanner;

public class Ej_03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
                
        System.out.println("En mayúsculas:"+frase.toUpperCase());
        System.out.println("En mayúsculas:"+frase.toLowerCase());
    }
    
}
