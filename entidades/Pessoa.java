
/*
 * Gabriel Vargas  
 */ 

package entidades;

public class Pessoa extends Usuario{

    private String cpf;
    private int sexo;

    public Pessoa(String cpf, int sexo, String nome,int contato, String email) {
        this.cpf = cpf;
        this.sexo = sexo;
        this.nome = nome;
        this.contato = contato;
        this.email = email;
    }

    public String getCpf() {
        return this.cpf;
    }
    
    public int getSexo() {
        return this.sexo;
    }


}