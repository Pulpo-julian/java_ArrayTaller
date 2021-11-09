
import java.util.*;


public class punto_04 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;

        System.out.println("ingrese la cantidad de numeros primos a averiguar: ");
        cantidad = sc.nextInt();
        
        sc.nextLine();
        
        Integer[] primos = new Integer[cantidad];
        List<Integer> listaPrimos = new ArrayList<Integer>();
        
        for(int i = 1; listaPrimos.size() < cantidad; i++) {
            
            int divisibles = 0;
            
            for(int j = 1; j <= i ; j++){
                
                if(i % j == 0){
                    divisibles ++;
                }
                
            }
            
            if (divisibles == 2){
                
                
                listaPrimos.add(i);

            }
            
        }
        
        System.out.println("----");

        for(int i = 0; i < listaPrimos.size(); i ++) {
            
            primos[i] = listaPrimos.get(i);
            System.out.println(primos[i]);
            
        }
        
        
        
    }
    
    
}
