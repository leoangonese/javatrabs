package Raio_e_diametro;

import java.util.Scanner;

public class Raio_e_diametro
{
    double raio;
            
    static Scanner leler = new Scanner(System.in);

public static void main (String[] args) 
{
System.out.println("Olá, espero que curta a sua visita. ");


       System.out.println("Digite seu número do raio: ");
       double raio = leler.nextInt();
       double diametro = (raio)*2;
       double quadrante = (raio)/ 4;
       
       
System.out.println("O diametro é: " + diametro); 
System.out.println("O quadrante é: " + quadrante); 

}

}

                        





    