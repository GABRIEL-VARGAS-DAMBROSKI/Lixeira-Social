// Emanuel Santos

package entidades;

public class Endereco{
	private int cep;
	private String logradouro;
	private int numero;
	private String cidade;
	private String uf;

	public Endereco(int cep, String logra, int num, String city, String uf){
		this.cep = cep;
		this.logradouro = logra;
		this.numero = num;
		this.cidade = city;
		this.uf = uf;
	}

	public int getCep(){
		return cep;
	}

	public String getLogradouro(){
		return logradouro;
	}

	public int getNumero(){
		return numero;
	}

	public String getCidade(){
		return cidade;
	}
	
	public String getUf(){
		return uf;
	}


}