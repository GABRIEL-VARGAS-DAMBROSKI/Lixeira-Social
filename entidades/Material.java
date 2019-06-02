//Emanuel Santos

package entidades;

import java.util.ArrayList;

public class Material {
	
	private String uni_medida;
	private Doacao doacao;
	
	public Material(String titulo, String descricao, ArrayList <String> tag, int quantidade) {
		
		
	}
	
	public String getUni_Medida(){
		return this.uni_medida;
	}

	public void setUnidadeMedida(String medida) {
		
		this.uni_medida = medida;
	}
	
	
}
