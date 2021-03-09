/*
Classe Livro com os seguintes atributos:
Título do tipo texto público;
Autor do tipo texto público;
Gênero do tipo texto privado;
Ano do tipo inteiro privado;
Preço do tipo real privado;
Métodos acessores
Método para verificarPreco
Métodos para verificar se tem desconto de 20% quando o valor do livro for maior do que 80,00    
 */
package leleopraticass;



public class livro 
{
    
    //Variaveis
    public String titulo;
    public String autor;
    private String genero;
    private int ano;
    private double preco;
    
    
    //getters and setters
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    

    public String verificarDesconto()
    {
        String resposta;
        if(this.preco >= 80 + (preco/20))
        {
            resposta = "Seu livro possui desconto de 20 % ";
        }   
        else
        {
            resposta = "Seu livro não possui desconto.";
        }
        return resposta;
    }    
    
    
    
    
    
}
