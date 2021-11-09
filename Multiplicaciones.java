
import java.util.Scanner;


public class Multiplicaciones {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int filas = 2;
        int column = 5;
        
        Integer[][] tabla = new Integer[filas][column];
        
        for(int i = 0; i <= (filas - 1); i++) {
            
            for(int j = 0; j <= (column - 1); j++){
                
                tabla[i][j] = i + 1;
                
            }
            
        }
        
        for(int i = 0; i <= (filas - 1); i++) {
            for(int j = 0; j <= (column - 1); j++){
                
                System.out.println( tabla[i][0] + " x " + tabla[i][j] + " = " + (tabla[i][0] * tabla[i][j]));
                tabla[i][j] = i + 1;
                
            }
        }
        
        

        
//        System.out.println("ingrese la primera tabla de multiplicar: ");
        
        
        
        
        
        
    }
    
}
