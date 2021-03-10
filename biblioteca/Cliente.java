package biblioteca;

public class Cliente
{
    public String nome;
    public int idade;
    private double renda;

    public Cliente() 
    {
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
    }

    
    
    public double getRenda()    
    {
        return renda;
    }

    public void setRenda(double renda) 
    {
        this.renda = renda;
    }
    
    public String verificarRenda()
    {
            String resposta;
            if(this.renda >= 1000)
        {
            resposta = "Sua renda salarial foi aceita para fazer um plano em nossa biblioteca";
        }
            else
        {
            resposta = "Não foi possivel fazer um plano em nossa biblioteca. Motivo: Renda salarial abaixo de um salario mínimo";
        }
            return resposta;
    }
    
    @Override
    public String toString()
    {
        return "Dados Cliente" + "\n"
        + "nome: " + this.nome + "\n" 
        + "idade: " + this.idade + "\n"
        + "renda: " + this.renda + "\n"; 
    }
    
   
    
    
}

