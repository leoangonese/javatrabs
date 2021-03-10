package biblioteca;
import java.util.Scanner;

public class MainClass
{

    public static void main(String[] args)    
    {
        Livro l1 = new Livro();
        Cliente c1 = new Cliente(); 
        
        
        Scanner ler = new Scanner(System.in);

        
        //Sistema de bem vindo.
        System.out.println("Bem Vindo ao nosso sistema da biblioteca ");
        System.out.println("Preciso que informe os dados que serão perguntados do livro e logo após do cliente. ");
        System.out.println("  ");
        
        //Interface livro e setters
        System.out.println("Digite o titulo do livro: ");
        l1.titulo = ler.nextLine();
        System.out.println("Digite o genero do livro: ");
        l1.genero = ler.nextLine();
        System.out.println("Digite o preço do livro: ");
        l1.setPreco(ler.nextDouble());
        
        //Introdução informações cliente 
        System.out.println("Os dados inseridos do lirvo estão sendo verificados!! Agora preciso dos dados do cliente, vamos la?");
        System.out.println("");
        
        
        
        //Interface cliente e setters
        System.out.println("Digite o nome do cliente: ");
        c1.nome = ler.next();
        
        System.out.println("Digite a idade do cliente: ");
        c1.idade = ler.nextInt();
        System.out.println("Digite a renda do cliente para saber se é possivel fazer um plano de livros em nossa loja: ");
        c1.setRenda(ler.nextDouble());
        
        //sistema de getters
        System.out.println(c1.getRenda());
        System.out.println(l1.getPreco());
        
        //Sistema de verificação
        System.out.println(l1);
        System.out.println(c1);
        
    }
    
}

