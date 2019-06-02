
/*
 * Gabriel Vargas
 * Modified by: Buzelli
 */

package teste;
import entidades.*;
import java.util.Scanner;

public class TelaUsuario{
       int cep;
       String logradouro = "";
       int numero;
       String cidade = "";
       String uf = "";
       String cpf = "";
       String sexo = "";
       String nome = "";
       String email = "";
       String cnpj = "";
       int contato;
       int flag;
        
       Scanner teclado = new Scanner(System.in);

        public void cadastrar(){

            System.out.println("Qual Tipo de Usuário?");
            System.out.println("=====================");
            System.out.println("1 - Pessoa Física");
            System.out.println("2 - Pessoa Jurídica");
            System.out.print(">> ");
     
            flag = teclado.nextInt();

            if(flag == 1){

                System.out.print("Nome: ");
                nome = teclado.nextLine();

                System.out.print("CPF: ");
                cpf = teclado.nextLine();

                System.out.print("sexo: ");
                sexo = teclado.nextLine();

                System.out.print("Numero: ");
                contato = teclado.nextInt();

                System.out.print("Email: ");
                email = teclado.nextLine();

                Pessoa pessoa = new Pessoa(
                    cpf,
                    sexo,
                    nome,
                    contato,
                    email
                );

                //Recebendo Endereço

                System.out.print("CEP: ");
                cep = teclado.nextInt();

                System.out.print("Logradouro: ");
                logradouro = teclado.nextLine();

                System.out.print("Número: ");
                numero = teclado.nextInt();

                System.out.print("Cidade: ");
                cidade = teclado.nextLine();

                System.out.print("UF: ");
                uf = teclado.nextLine();

                Endereco endereco = new Endereco(
                    cep,
                    logradouro,
                    numero,
                    cidade,
                    uf
                );

                teclado.close();

            }else{

                    System.out.print("CNPJ: ");
                    cnpj = teclado.nextLine();
        
                    System.out.print("Nome: ");
                    nome = teclado.nextLine();
        
                    System.out.print("Numero: ");
                    contato = teclado.nextInt();
        
                    System.out.print("Email: ");
                    email = teclado.nextLine();
        
                    Instituicao instituicao = new Instituicao(
                        cpf,
                        nome,
                        contato,
                        email
                    );
        
                    //Recebendo Endereço
        
                    System.out.print("CEP: ");
                    cep = teclado.nextInt();
        
                    System.out.print("Logradouro: ");
                    logradouro = teclado.nextLine();
        
                    System.out.print("Número: ");
                    numero = teclado.nextInt();
        
                    System.out.print("Cidade: ");
                    cidade = teclado.nextLine();
        
                    System.out.print("UF: ");
                    uf = teclado.nextLine();
        
                    Endereco endereco = new Endereco(
                        cep,
                        logradouro,
                        numero,
                        cidade,
                        uf
                    );
        
                    teclado.close();
            }
        }    

        public void consultar(){

            System.out.println("Qual Tipo de Usuário?");
            System.out.println("=====================");
            System.out.println("1 - Pessoa Física");
            System.out.println("2 - Pessoa Jurídica");
            System.out.print(">> ");

            Pessoa pessoa = new Pessoa();
            Endereco endereco = new Endereco();
            Instituicao instituicao = new Instituicao();
     
            flag = teclado.nextInt();

            if(flag==1){

                System.out.println("|============================================|");
                System.out.println("|==|"+ "       "+pessoa.getNome()+"       "+"|==|");
                System.out.println("|============================================|");
                System.out.println("|==| "+pessoa.getEmail()+" |=| "+pessoa.getContato()+"        |==|");
                System.out.println("|============================================|");
                System.out.println("|==| "+ pessoa.getSexo()+"       |=| "+pessoa.getCpf()+"  |==|");
                System.out.println("|============================================|");
                System.out.println("|==|              "+endereco.getCep()+"                |==|");
                System.out.println("|============================================|");
                System.out.println("|==| "+endereco.getLogradouro()  +", "+endereco.getNumero()+"               |==|");
                System.out.println("|============================================|");
            }else{

                System.out.println("|============================================|");
                System.out.println("|==|"+ "       "+instituicao.getNome()+"       "+"|==|");
                System.out.println("|============================================|");
                System.out.println("|==| "+instituicao.getEmail()+" |=| "+instituicao.getContato()+"        |==|");
                System.out.println("|============================================|");
                System.out.println("|==| "+ instituicao.getCnpj()+"       |=| "+endereco.getCep()+"  |==|");
                System.out.println("|============================================|");
                System.out.println("|==| "+endereco.getLogradouro()  +", "+endereco.getNumero()+"               |==|");
                System.out.println("|============================================|");

            }


        }
    
    
}
 
 