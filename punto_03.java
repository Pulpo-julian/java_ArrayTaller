
import java.util.Scanner;


public class punto_03 {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ingrese la cantidad de datos que tendra el array 1");    
        int cantidadNumeros = sc.nextInt();
        sc.nextLine();
        int cantidadPares = 0;
        int cantidadInpares = 0;
        
        Integer[] numeros = new Integer[cantidadNumeros];
        Integer[] numerosInvertidos = new Integer[cantidadNumeros];
        
        for(int i = 0; i < numeros.length; i++) {
            
            System.out.println("ingrese un numero en la posicion " + i + " del array");
            numeros[i] = sc.nextInt();
            sc.nextLine();
            
        }
        
        for(int i = 0; i <= (numeros.length - 1); i ++){
            
            int limite = (numerosInvertidos.length - 1) - i;
            numerosInvertidos[limite] = numeros[i];
            
        }
        
        for(int i = 0 ; i <= (numeros.length - 1); i++){
            System.out.println("el array 1 es " + numeros[i]);
        }
        
        for(int i = 0 ; i <= (numerosInvertidos.length - 1); i++){
            System.out.println("el array 2 invertido es " + numerosInvertidos[i]);
        }
        
        
    }
    
    
    
}
