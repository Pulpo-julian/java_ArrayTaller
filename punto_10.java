// punto 10

import java.util.*;

public class punto_10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cantidadM = 0;
        int cantidadN = 0;
        
        System.out.println("ingrese el tamaño M del arrayA");
        cantidadM = sc.nextInt();
        sc.nextLine();
        
        
        System.out.println("ingrese el tamaño N del arrayB");
        cantidadN = sc.nextInt();
        sc.nextLine();
        
        System.out.println("\n");
        
        Integer[] arrayA = new Integer[cantidadM];
        Integer[] arrayB = new Integer[cantidadN];
        
        
        Integer[] arrayC = new Integer[cantidadN + cantidadM];
        
        for(int i = 0; i < arrayA.length; i++){
            
            System.out.println("ingrese el dato " + i + " del arrayA");
            arrayA[i] = sc.nextInt();
            
            sc.nextLine();
            
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < arrayB.length; i++){
            
            System.out.println("ingrese el dato " + i + " del arrayB");
            arrayB[i] = sc.nextInt();
            
            sc.nextLine();
            
        }
        
        for(int i = 0; i <= (arrayA.length - 1); i++){
            
            arrayC[i] = arrayA[i];
            
        }
        
        for(int i = 1; i <= (arrayB.length); i++){
            
            arrayC[(arrayA.length - 1) + i] = arrayB[i - 1];
            
        }
        
        
        
        System.out.println("\n");
        
        
        System.out.println("el arrayC contiene al arrayA y arrayB:");
        for(int i: arrayC) {
            System.out.println(i);
        }
        
        
        
    }
    
}
