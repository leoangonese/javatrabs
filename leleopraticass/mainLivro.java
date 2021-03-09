/*
Digitar o nome do título, autor, gênero, ano e preço
O programa deverá retornar todas as informações digitadas e informar se o livro terá desconto
 */
package leleopraticass;
import java.util.Scanner;


public class mainLivro
{

    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        livro l1 = new livro();
        
        System.out.println("Bem vindo ao nosso sistema da livraria! ");
        System.out.println("");
        
        System.out.println("Digite o titulo: ");
        l1.setTitulo(ler.nextLine());
        
        System.out.println("Digite o autor: ");
        l1.setAutor(ler.nextLine());
        
        System.out.println("Digite o genero: ");
        l1.setGenero(ler.nextLine());
        
        System.out.println("Digite o ano de lançamento: ");
        l1.setAno(ler.nextInt());
        
        System.out.println("Digite o preço: ");
        l1.setPreco(ler.nextDouble());
        
        System.out.println(l1.getTitulo());
        System.out.println(l1.getAutor());
        System.out.println(l1.getGenero());
        System.out.println(l1.getAno());
        System.out.println(l1.getPreco());
        
        System.out.println(l1.verificarDesconto());
        
        
    }
    
}
