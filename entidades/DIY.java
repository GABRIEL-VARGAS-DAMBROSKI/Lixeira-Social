//André Buzelli

package entidades;

import java.util.ArrayList;

public class DIY{
    private String link;
    private Publicacao publicar;
    
    public DIY(String titulo, String descricao, String link, ArrayList<String> tag, ArrayList<String> fotos){
        publicar.titulo=titulo;
        publicar.descricao=descricao;
        this.link=link;
        publicar.tag=tag;
        publicar.fotos=fotos;

    } 

    public String getLink(){
        return this.link;
    }
}