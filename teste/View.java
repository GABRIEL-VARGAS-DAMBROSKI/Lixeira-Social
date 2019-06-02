// 

/* 
 * Gabriel Vargas Dambroski
 * Andre Buzelli Campones
 * Willam da Silva Pereira
 */

package teste;

import entidades.*;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;


public class View{

    public void executa(){
        
        int flag;

        System.out.println("|=========================================|");
        System.out.println("| OPÇÕES PARA INTERAGIR COM A REDE SOCIAL |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| 1 - Cadastrar Usuário                   |");
        System.out.println("| 2 - Consultar Usuário                   |");
        System.out.println("| 3 - Adicionar ponto de coleta           |");
        System.out.println("| 4 - Consultar ponto de coleta           |");
        System.out.println("| 5 - Criar uma Publicação                |");
        System.out.println("| 6 - Consultar uma Publicação            |");
        System.out.println("|=========================================|");
          
        Scanner teclado = new Scanner(System.in);
        TelaUsuario telaUsuario = new TelaUsuario();
        
        flag = teclado.nextInt();
        System.out.println("Essa foi a flag digitada: " + flag);

        System.out.println("====================");

        

        if(flag == 1){
            telaUsuario.cadastrar();
        }
        else if(flag == 2){
            //Chamar telaUsuario.consultar();
        }
        else if(flag == 3){
            //Chamar telaPontoColeta.adicionar();
        }
        else if(flag == 4){
            //Chamar telaPontoColeta.consultar();            
        }
        else if(flag == 5){
            //Chamar telaPublicacao.criar();
        }
        else if(flag == 6){
            //Chamar telaPublicacao.consultar();
        }

        
        
        
        teclado.close();

    }
}