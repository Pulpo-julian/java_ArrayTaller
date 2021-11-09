// punto 2

import java.util.Scanner;


public class punto_02 {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de datos que tendra el array");    
        int cantidadNumeros = sc.nextInt();
        sc.nextLine();
        int cantidadPares = 0;
        int cantidadInpares = 0;
        
        Integer[] numeros = new Integer[cantidadNumeros];
        
        for(int i = 0; i < numeros.length; i++) {
            
            System.out.println("ingrese un numero en la posicion " + i + " del array");
            numeros[i] = sc.nextInt();
            sc.nextLine();
            
        }
        
        
        
    }
    
}
