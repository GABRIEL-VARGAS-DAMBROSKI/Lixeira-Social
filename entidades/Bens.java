/*************************************
By: William da Silva Pereira - 100942
*************************************/


package entidades;


import java.util.ArrayList;

public class Bens extends Doacao
{
	private String estadoConservacao;
	private String tempoUso;


	//Construtor
	public Bens
	(
		String titulo,
		String descricao,
		ArrayList<String> tag,
		int quantidade,
		ArrayList<String> fotos
	)
	{
		this.titulo = titulo;
		this.descricao = descricao;
		this.tag = tag;
		this.quantidade = quantidade;
		this.fotos = fotos;
	}

	
	
	//GETs
	public String getEstadoConservacao()
	{
		return this.estadoConservacao;
	}

	public String getTempoUso()
	{
		return this.tempoUso;
	}


	//SETs
	public void setTempoUso(String tempoUso)
	{
		this.tempoUso = tempoUso;
	}

	public void setEstadoConservacao(String estadoConservacao)
	{
		this.estadoConservacao = estadoConservacao;
	}
}