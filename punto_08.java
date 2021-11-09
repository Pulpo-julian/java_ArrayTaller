// punto 8

import java.util.*;

public class punto_08 {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        
        System.out.println("ingrese la cantidad de datos para el array?");
        cantidad = sc.nextInt();
        
        sc.nextLine();
        
        Integer[] listaNotas = new Integer[cantidad];
        
        for (int M = 0; M < listaNotas.length; M++) {
            
            System.out.println("ingrese el dato " + M );
            listaNotas[M] = sc.nextInt();
            
        }
        
        Arrays.sort(listaNotas);
        List listaNumeros =  Arrays.asList(listaNotas);
        Set<Integer> lista = new HashSet<Integer>(listaNumeros);
        
        for(int n: lista) {
            System.out.println("el numero " + n + " esta " + Collections.frequency(listaNumeros, n));
        }
        
        
    }
    
}
