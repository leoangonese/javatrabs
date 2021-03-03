package calculodavariavel;

import java.util.Scanner;

public class Calculodavariavel
{
    double leo;
            
    static Scanner leler = new Scanner(System.in);

public static void main (String[] args) 
{
System.out.println("Olá visitante. ");


       System.out.println("Digite seu número: ");
       double leo = leler.nextInt();
       
System.out.println("o dobro é: " + leo *2  ); 
System.out.println("o triplo é: " + leo *3  ); 
System.out.println("a metade do triplo é: " + (leo *3)/2  ); 
System.out.println("o quadrado da variável é: " + (leo) * (leo)  ); 
System.out.println("a quinta parte do dobro é: " + (leo *2)/5  ); 
}

}

                        





    