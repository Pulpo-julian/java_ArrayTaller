
import java.util.*;

public class punto_06 {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;

        
        System.out.println("ingrese la cantidad de numeros a ingresar: ");
        cantidad = sc.nextInt();
        
        sc.nextLine();
        
        Integer[] numeros = new Integer[cantidad];
        
        for(int i = 0; i < numeros.length; i++){
            System.out.println("ingrese el dato " + i );
            numeros[i] = sc.nextInt();
            
            sc.nextLine();
        }
        
        Arrays.sort(numeros);
        
        System.out.println("-----");
        
        for(int n: numeros) {
            System.out.println(n);
        }
        
        
    }
    
    
}
