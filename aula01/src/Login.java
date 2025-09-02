

/*
Estamos desenvolvendo um sistema para a nossa ONG “Solidariedade sem Fronteiras” e precisamos definir um
usuário administrador que faça o login inicial ao nosso sistema. Precisamos fazer um programa que verifique
se o usuário digitado é igual a “administrador” e se a senha digitada é igual a “123”.
 */

import java.util.Scanner;

public class Login {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String login, senha;

        System.out.println("Digite o usuário: ");
        login = leitor.nextLine();

        System.out.println("Digite a senha: ");
        senha = leitor.nextLine();

        if (login.equalsIgnoreCase("admin") && senha.equals("123")){
            System.out.println("Acesso liberado");
        }
        else{
            System.out.println("Acesso negado");
        }
    }

}
