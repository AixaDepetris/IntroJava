package guía_01;

import java.util.Scanner;

public class Ej_04 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int grados;
        double faren;
        
        System.out.println("Ingrese grados");
        grados = leer.nextInt();
        faren = grados*1.8+32;
        
        System.out.println(grados+"º centígrados equivalen a "+faren+"º.");        
        
    }
    
}
