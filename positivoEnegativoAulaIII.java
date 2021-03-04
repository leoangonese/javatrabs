package trabalhoII;
import java.util.Scanner;

public class positivoEnegativoAulaIII {
    
    double leolindo;  
    
    static Scanner leler = new Scanner(System.in);
   
    public static void main(String[] args)
    {
        
        System.out.println("Olá forasteiro, vou lhe ajudar a saber se um número é positivo ou negativo!");
        
        System.out.println("Digite seu número: ");
        double leolindo = leler.nextDouble();
   
        
        if(leolindo >= 0) 
        {
            System.out.println("O número é positivo!");
        }
        else
        {
            System.out.println("O número é negativo!");
        }
        
        
    }
    
}
