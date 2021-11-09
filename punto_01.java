// punto 1

import java.util.Scanner;


public class punto_01 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de datos que tendra el array");    
        int cantidadNumeros = sc.nextInt();
        sc.nextLine();
        int cantidadPositivos = 0;
        int cantidadNegativos = 0;
        int cantidadCeros = 0;
       
        
        Integer[] numeros = new Integer[cantidadNumeros];
        
        for(int i = 0; i < numeros.length; i++) {
            
            System.out.println("ingrese un numero en la posicion " + i + " del array");
            numeros[i] = sc.nextInt();
            sc.nextLine();
            
        }
        
        for(int i = 0; i <= (numeros.length - 1); i++) {
            
            if(numeros[i] > 0 ){
                cantidadPositivos ++;
            } else {
                cantidadNegativos ++;
            }
            
            if(numeros[i] == 0 ) {
                cantidadCeros ++;
            }
            
        }
        
        System.out.println("la cantidad de positivos son: " + cantidadPositivos);
        System.out.println("la cantidad de negativos son: " + cantidadNegativos);
        System.out.println("la cantidad de ceros son: " + cantidadCeros);
        
        
        
        
    }
    
    
}
