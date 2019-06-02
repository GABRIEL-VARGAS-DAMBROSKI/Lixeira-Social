//Emanuel Santos

package entidades;

import java.util.ArrayList;

public class Material extends Doacao {
	
	private String unidadeMedida;
	
	public Material(String titulo, String descricao, ArrayList <String> tag, int quantidade) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.tag = tag;
		this.quantidade = quantidade;
	}
	
	public String getUnidadeMedida(){
		return this.unidadeMedida;
	}

	public void setUnidadeMedida(String medida) {
		
		this.unidadeMedida = medida;
	}
	
	
}
