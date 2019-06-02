
/*
 * Gabriel Vargas 
 */ 

 package entidades;
import java.util.ArrayList;

 public class Publicacao{

    protected String titulo;    
    protected String descricao;
    protected Usuario publicador;
    protected String status;
    protected ArrayList<String> tag;
    protected ArrayList<String> fotos;

    public String getTitulo(){
        return this.titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public ArrayList<String> getTag() {
        return tag;
    }
    

 }