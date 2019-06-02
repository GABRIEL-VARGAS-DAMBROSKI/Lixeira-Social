
/*
 * Gabriel Vargas  
 * Modified by: William 
 */

package teste;


import java.util.Scanner;
import java.util.ArrayList;

import entidades.*;


public class TelaPublicacao
{

    public void criar()
    {
        Scanner teclado = new Scanner(System.in);

        //Peguntar para o usuario o tipo de Publicacao
        System.out.println("O que deseja publicar?");
        System.out.println("=====================");
        System.out.println("1 - Nova doacao");
        System.out.println("2 - Novo DIY (Do It Yourself");
        System.out.print(">> ");

        int resposta = teclado.nextInt();

            if(resposta == 1)
            {
                //Nova doacao
                //Perguntar o tipo 
                
            }
            else if( reposta == 2) //DIY
            {
                //Fazer novo DIY

                //Variaveis para receber valores do usuario
                String titulo;
                ArrayList<String> tag = new ArrayList<String>();
                ArrayList<String> fotos = new ArrayList<String>();
                String descricao;
                Usuario publicador;
                String status;
                String link;
                
                System.out.println("Titulo: ");
                //Ler Titulo

                System.out.println("TAGS: ");
                //Ler uma ou mais TAGS ***

                System.out.println("Fotos: ");
                //Ler PATH de uma ou mais imagens

                System.out.println("Descricao: ");
                //Ler a descricao

                System.out.println("Link para acesso: ");
                //Ler a URL



                //Status - por padrao ativo = 1;
                //**RECEBER um USUARIO por parametro para vincular a esta nova publicacao */


            }

    }    


}