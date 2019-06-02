
/*
 * Gabriel Vargas  
 */

package entidades;

import java.util.ArrayList;

public class PontoDeColeta extends Publicacao{

    private String coordenada;
    private ArrayList<Material> material;

    public PontoDeColeta(String titulo, String descricao, String coordenada, ArrayList<String> tag, ArrayList<Material> material) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.coordenada = coordenada;
        this.tag = tag;
        this.material = material;
    }

    public String getCoordenada() {
        return coordenada;
    }

    
}