// punto 7

import java.util.*;

public class punto_07 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int notas = 0;
        
        System.out.println("cuantas notas desea ingresar?");
        notas = sc.nextInt();
        
        sc.nextLine();
        
        Double[] listaNotas = new Double[notas];
        
        for (int i = 0; i < listaNotas.length; i++) {
            
            System.out.println("ingrese la nota " + i );
            listaNotas[i] = sc.nextDouble();
            
        }
        
        Arrays.sort(listaNotas);
        
        System.out.println("la nota mayor es " + listaNotas[notas - 1]);
        System.out.println("la nota menor es " + listaNotas[0]);
        
        
        
    }
    
}
