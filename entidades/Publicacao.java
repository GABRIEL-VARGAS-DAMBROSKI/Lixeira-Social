//André Buzelli


package entidades;

import java.util.ArrayList;

public class Publicacao{
    protected String titulo;
    protected String descricao;
    private String status;
    private Usuario publicador;
    protected ArrayList<String> tag;
    protected ArrayList<String> fotos;

    public String getTitulo(){
        return this.titulo;
    }
    public ArrayList<String> getTag(){
        return this.tag;
    }
    public String getDescricao(){
        return this.descricao;
    }
}