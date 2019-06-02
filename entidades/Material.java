
/*
 * Gabriel Vargas  
 */

package entidades;
import java.util.ArrayList;

public class Material extends Doacao{

    private String unidadeMedida;

    public Material(String titulo, String descricao, int quantidade, ArrayList<String> tag) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.tag = tag;
    }

    public String getUnidadeMedida() {
        return this.unidadeMedida;
    }
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }


}