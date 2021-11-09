// punto 5

import java.util.Scanner;


public class punto_05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;

        System.out.println("ingrese la cantidad de numeros a ingresar: ");
        cantidad = sc.nextInt();
        
        sc.nextLine();
        
        Integer[] primos = new Integer[cantidad];
        
        for(int i = 0; i < primos.length; i ++){
            System.out.println("ingrese el dato " + i + " del array: " );
            primos[i] = sc.nextInt();
            
            sc.nextLine();
            
        }
        
        
        
        for(int i = 0; i < primos.length; i++) {
            
            int divisibles = 0;
            
            for(int j = 1; j <= primos[i] ; j++){
                
                if(primos[i] % j == 0){
                    divisibles ++;
                }
                
            }
            
            if (divisibles == 2){
                
                System.out.println( primos[i] + " es primo");

            }
            
        }
        
        
        
    }
    
}
