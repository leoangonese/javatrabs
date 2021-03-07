package trabalhoiiii;


public class trabalhoIIII
{
    
    public String nome;
    private int idade;
    private double renda;
    
    
    
    //Classificar nome.
        public String getNome()
        {
            return nome;
        }    
        public void setNome(String nome)
        {
            this.nome = nome;
        }

        
    //Classificar e retornar idade.
        public int getIdade() 
        {
            return idade;
        }
        public void setIdade(int idade) 
        {
            this.idade = idade;
        }
        public String verificarIdade() 
        {
            String resposta;
            if(this.idade >= 18 ) 
            {
                resposta = "Você é maior de idade Sr." + nome;
            }
            else
            {
                resposta = "Você é menor de idade Sr." + nome;
            }
            return resposta;
        }
        
    //Classificar e retornar renda.         
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
            if(this.renda >= 15000 ) 
            {
                resposta = "Você é rico Sr." + nome;
            }
            else
            {
                resposta = "Você é pobre Sr." + nome;
            }
            return resposta;
        }

            
}
