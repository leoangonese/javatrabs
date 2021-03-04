package trabalhoii;
import java.util.Scanner;
   


public class igualOUdiferenteAulaIII
        
        
{
    static Scanner leler = new Scanner(System.in);
    
    
    public static void main(String[] args) 
    {
        double leolindo,leolindao;    
        
        System.out.println("Olá internauta, vou lhe ajudar a saber se seu número é igual ou diferente! ");
        
        System.out.println("Digite o primeiro número: ");
        leolindo = leler.nextDouble();
        System.out.println("Digite o segundo número: ");
        leolindao = leler.nextDouble();
        
        
        
        if(leolindo == leolindao) 
        {
            System.out.println("Os números são iguais!");
        }
        else
        {
            System.out.println("Os números são diferentes!");
        }
        
    }
    
}
