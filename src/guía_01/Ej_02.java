package guía_01;

import java.util.Scanner;

public class Ej_02 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        
        System.out.println("Bienvenido "+nombre);
        
        
    }
    
}
