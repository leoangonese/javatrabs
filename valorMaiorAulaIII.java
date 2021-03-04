package trabalhoii;
import java.util.Scanner;
   


public class valorMaiorAulaIII
        
        
{
    static Scanner leler = new Scanner(System.in);
    
    
    public static void main(String[] args) 
    {
        double leolindo,leolindao;    
        
        System.out.println("Ola parceiro, vou lhe ajudar a saber quais algoritmos são maiores! ");
        
        System.out.println("Digite o primeiro número: ");
        leolindo = leler.nextDouble();
        
        System.out.println("Digite o primeiro número: ");
        leolindao = leler.nextDouble();
        
        
        
        if(leolindo < leolindao) 
        {
            System.out.println("O número maior é: " + leolindao );
        }
        else
        {
            System.out.println("O número maior é: " + leolindo);
        }
        
    }
    
}
