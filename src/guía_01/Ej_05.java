package guía_01;

import java.util.Scanner;

public class Ej_05 {

    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);
        
        int num1;
        
        System.out.println("Ingrese un número");
        num1 = leer.nextInt();
        
        System.out.println("El doble del número "+num1+" es: "+(num1*2));
        System.out.println("El triple del número "+num1+" es: "+(num1*3));
        System.out.println("La raíz cuadrada de "+num1+" es "+Math.sqrt(num1));

    }
    
}
