// Ler idade e se possui carteira de motorista. Informe se pode dirigir usando operador lógico.

import java.util.Scanner;

public class LiberarCarteira {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.print("Possui Carteira de Habilitação (CNH) ? ");
        String possuiHabilitacao = input.next();

        String pode_dirigir = idade >= 18 && possuiHabilitacao.equalsIgnoreCase("Sim") ? "pode dirigir": "não pode dirigir";

        System.out.printf("Sua idade é %d e você %s!", idade, pode_dirigir);
    }
}

