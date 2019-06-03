/*************************************
By: William da Silva Pereira - 100942
*************************************/

package teste;



import java.util.Scanner;
import java.util.ArrayList;
import entidades.*;



public class TelaPublicacao
{


    public static void criar()
    {
        Scanner teclado = new Scanner(System.in);

        //Peguntar para o usuario o tipo de Publicacao
        System.out.println("O que deseja publicar?");
        System.out.println("=====================");
        System.out.println("1 - Nova doacao");
        System.out.println("2 - Novo DIY (Do It Yourself)");
        System.out.print(">> ");

        int resposta_publicacao = teclado.nextInt();

            if(resposta_publicacao == 1) //Nova doacao//
            {
                //Fazer nova doacao
            	
            	System.out.println("O que deseja Doar?");
                System.out.println("=====================");
                System.out.println("1 - Material");
                System.out.println("2 - Bens");
                System.out.print(">> ");
                
                int resposta_doacao = teclado.nextInt();
                
                	if(resposta_doacao == 1)
                	{
                		//Doacao de Material
                	}
                	else if(resposta_doacao == 2)
                	{
                		//Doacao de Bens
                	}
                
            }
            else if( resposta_publicacao == 2) //DIY//
            {
                //Fazer novo DIY  
            	
                System.out.println("Titulo: ");
                String titulo = teclado.nextLine();
                
                System.out.println("TAGS: ");
                //Ler uma ou mais TAGS ***

                System.out.println("Fotos: ");
                //Ler PATH de uma ou mais imagens

                System.out.println("Descricao: ");
                String descricao = teclado.nextLine();

                System.out.println("Link para acesso: ");
                String link = teclado.nextLine();
                


                //Status - por padrao ativo = 1;
                //String status;
                //**RECEBER um USUARIO por parametro para vincular a esta nova publicacao */
                /*
           	 
                ArrayList<String> tag = new ArrayList<String>();
                ArrayList<String> fotos = new ArrayList<String>();
                Usuario publicador;

                */

            }
            
            teclado.close();//Fechando o teclado

    }    


}