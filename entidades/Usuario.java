
/*
 * Gabriel Vargas  
 */ 

package entidades;

 public class Usuario{

    protected String nome;
    protected int contato;
    protected String email;
    protected String senha;
    protected Endereco endereco;

    

    public String getNome() {
        return this.nome;
    }

    public int getContato() {
        return this.contato;
    }
    
    public String getEmail() {
        return this.email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }



 }