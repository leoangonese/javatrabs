
package nome_e_media;
import java.util.Scanner;

public class nome_e_media
        {
    String nome ;
    double nota1,nota2,nota3;
    
    static Scanner leler = new Scanner(System.in);

public static void main(String[] args) 
{
       System.out.println("Olá, esse é um programa para sabermos nossas notas.");
       
       
       System.out.println("Digite o seu nome: ");
       String nome = leler.nextLine();
       System.out.println("Digite a sua primeira nota: ");
       double nota1 = leler.nextInt();
       System.out.println("Digite a sua segunda nota: ");
       double nota2 = leler.nextInt();
       System.out.println("Digite a sua terceira nota: ");
       double nota3 = leler.nextInt();
        
       
       System.out.println("Visualizando suas notas:");
       System.out.println("A sua média é: " + (nota1 + nota2 + nota3)/ 3);
       }

}

    


    



