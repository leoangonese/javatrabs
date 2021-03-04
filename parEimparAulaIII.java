package trabalhoii;
import java.util.Scanner;
   


public class parEimparAulaIII
        
        
{
    static Scanner leler = new Scanner(System.in);
    
    
    public static void main(String[] args) 
    {
        double leolindo;    
        
        System.out.println("Ola amigo, vou lhe mostrar se seu número é par ou ímpar! ");
        
        System.out.println("Digite o primeiro número: ");
        leolindo = leler.nextDouble();
        
        
        
        if (leolindo % 2 == 0) 
        {
            System.out.println("O número é par");
        }
        else
        {
            System.out.println("O número é ímpar");
        }
        
    }
    
}
