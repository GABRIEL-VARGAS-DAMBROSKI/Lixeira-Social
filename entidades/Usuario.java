// Andre Buzelli

package entidades;

public class Usuario{
    private String nome;
    private int contato;
    private String email;
    private String senha;
    private Endereco endereco;

    public String getNome(){
        return this.nome;
    }
    public int getContato(){
        return this.contato;
    }
    public String getEmail(){
        return this.email;
    }

    public void setSenha(String senha){
        this.senha=senha;
    }
}