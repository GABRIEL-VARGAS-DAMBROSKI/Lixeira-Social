/*************************************
By: William da Silva Pereira - 100942
*************************************/

package entidades;

public class Instituicao extends Usuario
{
	private String cnpj;

	//Construtor
	public Instituicao
	(
		String cnpj, 
		String nome,
		int contato,
		String email
	)
	{
		this.cnpj = cnpj;
		this.nome = nome;
		this.contato = contato;
		this.email = email;
	}


	//GETs
	public String getCnpj()
	{
		return this.cnpj;
	}


}