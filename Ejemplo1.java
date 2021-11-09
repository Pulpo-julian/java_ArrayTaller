
import java.util.Scanner;


public class Ejemplo1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
//        int numero = 0;
//        
//        System.out.println("ingrese la tabla del numero que quiere multiplicar");
//        numero= sc.nextInt();
//        
//        sc.nextLine();
//        
//        for(int i = 0; i <= 10 ; i++){
//            System.out.println( numero + " x " + i + " = " + ( i * numero));
//        }
//        
//        String nombre = "";
        
        System.out.println("ingrese la cantidad de datos que tendra el array");    
        int cantidadNumeros = sc.nextInt();
        sc.nextLine();
        int numeroMayor = 0;
        int numeroMayorReal = 0;
        
//        String[] nombres = new String[cantidadNumeros];

        Integer[] numeros = new Integer[cantidadNumeros];
        
        System.out.println(numeros.length);
        
        
        for(int i = 0; i < numeros.length; i++) {
            
            System.out.println("ingrese la posicion " + i + " del array");
            numeros[i] = sc.nextInt();
            sc.nextLine();
            
        }
        
        
        for(int i = 0; i <= (numeros.length-1); i++) {
            
            
            System.out.println("EN EL CICLO " + i);
            
            System.out.println("se compara " + numeros[i]);
            
            for(int j = 1; j <= (numeros.length-1); j++) {
                
                System.out.println("con " + numeros[j]);
                
                if(numeros[i] > numeros[j]){
                    
                    if(numeroMayor == 0) {
                        numeroMayor = numeros[i];
                    }
                    
                    numeroMayor = numeros[i];
                    
                    if(numeroMayor > numeroMayorReal){
                        numeroMayorReal = numeroMayor;
                    }
                    
                    
                } 
                
            }
            
            System.out.println("el mayor es por el momento " + numeroMayorReal);
            
        }



        
        
        
        System.out.println("el numero mayor es: " + numeroMayorReal);
        
        
        
    }
    
}
