//Ler a idade e utilizar o operador ternário para mostrar: Maior de idade; Menor de idade

import java.util.Scanner;

public class LerIdade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu idade: ");
        int idade = input.nextInt();

        String maior = idade >= 18 ? "maior de idade" : "menor de idade";

        System.out.printf("Você tem %d anos e é %s!", idade, maior);
    }
}
