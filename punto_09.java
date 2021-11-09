
import java.util.*;

public class punto_09 {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        int auxiliar = 0;
        
        System.out.println("ingrese el tamaño de los Arrays");
        cantidad = sc.nextInt();
        
        sc.nextLine();
        
        Integer[] arrayA = new Integer[cantidad];
        Integer[] arrayB = new Integer[cantidad];
        
        for(int i = 0; i < arrayA.length; i ++) {
            System.out.println("ingrese el dato " + i + " del array A");
            arrayA[i] = sc.nextInt();
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < arrayB.length; i ++) {
            System.out.println("ingrese el dato " + i + " del array B");
            arrayB[i] = sc.nextInt();
        }
        
        
        for(int i = 0; i < arrayA.length; i++) {
            auxiliar = arrayA[i];
            arrayA[i] = arrayB[i];
            arrayB[i] = auxiliar;
        }
        
        System.out.println("\n-------\n");
        
        System.out.println("el array A ahora es: ");
        for(int n: arrayA) {
            System.out.println(n);
        }
        
        
        
        System.out.println("\n-------\n");
        
        System.out.println("el array B ahora es: ");
        for(int n: arrayB) {
            System.out.println(n);
        }
        
        
    }
    
}
