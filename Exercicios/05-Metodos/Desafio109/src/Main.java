/*
Ler a idade de 15 pessoas e mostrar:
média das idades;
maior idade;
menor idade;
quantidade de maiores de idade;
quantidade de menores de idade.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> idades = new ArrayList<>();

        for (int i = 0; i < 15; i++){
            System.out.print("Digite uma idade: ");
            idades.add(input.nextInt());
        }

        double mediaIdades = PesquisaIdade.mediaIdades(idades);
        System.out.printf("\nA média das idades digitadas foi: %.2f%n", mediaIdades);

        int maiorIdade = PesquisaIdade.maiorIdade(idades);
        System.out.printf("A maior idade digitada foi: %d%n", maiorIdade);

        int menorIdade = PesquisaIdade.menorIdade(idades);
        System.out.printf("A menor idade digitada foi: %d%n", menorIdade);

        int quantidadeMaiores = PesquisaIdade.maioresIdades(idades);
        System.out.printf("Total de maiores de idade: %d%n", quantidadeMaiores);

        int quantidadeMenores = PesquisaIdade.menoresIdades(idades);
        System.out.printf("Total de menores de idade: %d%n", quantidadeMenores);

        input.close();

    }
}
