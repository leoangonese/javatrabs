
package biblioteca;


public class Livro
{
    public String titulo;
    public String genero;
    private double preco;

    public Livro() 
    {
        this.titulo = titulo;
        this.genero = genero;
        this.preco = preco;
    }

    public double getPreco() 
    {
        return preco;
    }

    public void setPreco(double preco)  
    {
        this.preco = preco;
    }
    
    //Desconto em livros com preço maior que 100 reais.
    
    public String verificarPreco()
    {
        String resposta;
        if(this.preco >= 100)
        {
            resposta = "Livros com o valor maior que 100 reais recebem 20% de desconto, o preço final de seu livro é: " + preco * 0.80;
        }   
        else
        {
            resposta = "Seu livro não possui desconto, pois o valor dele é menor que 100 reais.";
        }
        return resposta;
    } 
    
    @Override
    public String toString()
    {
        return "Dados Livro" + "\n"
        + "titulo: " + this.titulo + "\n" 
        + "gênero: " + this.genero + "\n"
        + "preço: " + this.preco * 0.80; 
    }
    
    

}



