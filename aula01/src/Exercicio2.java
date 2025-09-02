import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        //Usuário informará os comodos e as medidas
        //area do comodo e no final exibir a area da residencia

        String nomeComodo;
        double larg, comp, areaComodo = 0 , areaTotal = 0;

        System.out.println("Nome do comodo: ");
        nomeComodo = leitorTexto.nextLine();

        System.out.println("Largura: ");
        larg = leitor.nextDouble();

        System.out.println("Comprimento: ");
        comp = leitor.nextDouble();

        areaComodo = larg * comp;

        System.out.println("área da(o) " + nomeComodo + " é " + areaComodo + "m²");

        //calcular a area total
        //Exibir a area total


    }
}

