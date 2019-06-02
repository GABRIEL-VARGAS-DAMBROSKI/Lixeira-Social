//André Buzelli

package entidades;

import java.util.ArrayList;

public class DIY extends Publicacao{
    
	private String link;
    
    public DIY(String titulo, String descricao, String link, ArrayList<String> tag, ArrayList<String> fotos){
        this.titulo=titulo;
        this.descricao=descricao;
        this.link=link;
        this.tag=tag;
        this.fotos=fotos;

    } 

    public String getLink(){
        return this.link;
    }
    
    public void setLink(String link) {
    	this.link = link;
    }
}