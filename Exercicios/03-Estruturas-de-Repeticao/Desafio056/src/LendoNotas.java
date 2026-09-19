// Ler notas. Após cada nota, pergunte se deseja inserir outra.
// Quando finalizar, calcule a média.

import java.util.Scanner;

public class LendoNotas {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("<<<  CALCULANDO MÉDIA  >>>");
        String resposta;
        int soma = 0;
        int contador = 0;

        do {
            System.out.print("\nDigite uma nota: ");
            double nota = input.nextDouble();
            soma += nota;
            contador += 1;

            System.out.print("\nQuer continuar ? [S/N]: ");
            resposta = input.next().toUpperCase();
        }while (!resposta.equals("N"));

        double media = soma / contador;
        System.out.printf("A média das notas digitas é: %.1f", media);

    }
}
