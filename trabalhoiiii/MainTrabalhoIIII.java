package trabalhoiiii;
import java.util.Scanner;


public class MainTrabalhoIIII 
{
    
      
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        trabalhoIIII n1 = new trabalhoIIII();
        
        
        
        System.out.println("Olá Forasteiro, o que faz aqui?");
        System.out.println("  ");
        
        System.out.println("Informe seu nome: ");
        n1.setNome(ler.nextLine());
        
        System.out.println("Digite sua idade: ");
        n1.setIdade(ler.nextInt());
        System.out.println(n1.verificarIdade());
        
        System.out.println("Digite sua renda: ");
        n1.setRenda(ler.nextInt());
        System.out.println(n1.verificarRenda()); 
    
    }
    
}
