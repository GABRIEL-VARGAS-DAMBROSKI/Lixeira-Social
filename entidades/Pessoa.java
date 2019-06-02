
/*
 * Gabriel Vargas  
 */ 
package entidades;


public class Pessoa extends Usuario{

    private String cpf;
    private String sexo;

    public Pessoa(String cpf, String sexo, String nome,int contato, String email) {
        
        // PESSOA
        this.cpf = cpf;
        this.sexo = sexo;
        this.nome = nome;
        this.contato = contato;
        this.email = email;
    }

    public Pessoa() {
        
    }
    

    public String getCpf() {
        return this.cpf;
    }
    
    public String getSexo() {
        return this.sexo;
    }


}