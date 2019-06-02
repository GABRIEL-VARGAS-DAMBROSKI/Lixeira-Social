
/*
 * Gabriel Vargas  
 */


package teste;
import java.util.ArrayList;
import java.util.Scanner;
import entidades.*;


public class TelaPontoColeta{

    public void adicionar(){

        String titulo;
        String descricao;
        String coordenada;
        ArrayList<String> tag = new ArrayList<String>();
        ArrayList<Material> material = new ArrayList<Material>();


        Scanner teclado = new Scanner(System.in);

        System.out.println("Título para a publicacao");
        titulo = teclado.nextLine();

        System.out.println("Descrição do ponto de coleta");
        descricao = teclado.nextLine();

        System.out.println("Coordenada do maps: ");
        descricao = teclado.nextLine();

        int i = 1;

        System.out.println("Quais tags você deseja colocar na sua publicação");
        System.out.println("digite '0' quando colocar todas as tags");
        do{
            tag = teclado.nextInt();
        }while(i != 0);



        PontoDeColeta pontoDeColeta = new PontoDeColeta(
            titulo, 
            descricao, 
            coordenada, 
            tag, 
            material
        )



    }



}
