
/*
 * Gabriel Vargas  
 */ 

package entidades;

 public class Instituicao extends Usuario{

    private String cnpj;

    public Instituicao(String cnpj, String nome, int contato,String email) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.contato = contato;
        this.email = email;
    }

    public Instituicao() {
        
    }

    public String getCnpj() {
        return this.cnpj;
    }

 }