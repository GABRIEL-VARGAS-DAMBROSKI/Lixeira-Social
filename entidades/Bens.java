
/*
 * Gabriel Vargas  
 */

package entidades;
import java.util.ArrayList;


public class Bens extends Doacao{

    private String estadoConservacao;
    private String tempoUso;

    public Bens(String titulo, String descricao, int quantidade, ArrayList<String> tag, ArrayList<String> fotos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.tag = tag;
        this.fotos = fotos;
    }

    //GETTERS e SETTERS
    
    //Estado Conservacao
    public String getEstadoConservacao() {
        return this.estadoConservacao;
    }
    public void setEstadoConservacao(String estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    //Tempo de Usso
    public String getTempoUso() {
        return this.tempoUso;
    }
    public void setTempoUso(String tempoUso) {
        this.tempoUso = tempoUso;
    }

 }