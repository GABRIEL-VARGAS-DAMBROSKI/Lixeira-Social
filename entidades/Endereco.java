
/*
 * Gabriel Vargas  
 */ 

 package entidades;

 public class Endereco{

    private int cep;
    private String logradouro;
    private int numero;
    private String cidade;
    private String UF;

    
    public Endereco(int cep, String logradouro, int numero, String cidade, String uf) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.UF = uf;
    }

    public Endereco() {
        
    }
    


    public int getCep() {
        return this.cep;
    }
    

    public String getCidade() {
        return this.cidade;
    }
    

    public String getLogradouro() {
        return this.logradouro;
    }
    

    public int getNumero() {
        return this.numero;
    }
    

    public String getUF() {
        return this.UF;
    }
    
 }