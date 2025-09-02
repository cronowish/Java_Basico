
/*

Efetuar a leitura de 3 notas de um aluno
Tirar a média
E exibir  a mensagem: Aprovado quando a média for maior que 6 e reprovado quando menor que 3 e entre 3 e 6 exibir exame

Exibir a média

 */

import java.util.Scanner;

public class DecisaoCompleta {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Digite a nota 1: ");
        nota1 = leitor.nextDouble();

        System.out.println("Digite a nota 2: ");
        nota2 = leitor.nextDouble();

        System.out.println("Digite a nota 3: ");
        nota3 = leitor.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média: : " + media);

        if (media > 6){
            System.out.println("Aluno aprovado");
        }
        else if (media < 3){
            System.out.println("Aluno reprovado");
        }
        else {
            System.out.println("Aluno em exame");
        }

    }

}
