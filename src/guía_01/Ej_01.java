package guía_01;

import java.util.Scanner;

public class Ej_01 {
  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingrese un número");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese otro número");
        num2 = leer.nextInt();
        
        System.out.println("La suma de los dos números es "+(num1+num2));
        
    }
    
}
