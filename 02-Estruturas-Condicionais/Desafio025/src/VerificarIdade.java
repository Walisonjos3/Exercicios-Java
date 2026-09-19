// Ler a idade de uma pessoa e informe sua categoria: Menor de idade, Maior de idade e Idoso (60 anos ou mais)

import java.util.Scanner;

public class VerificarIdade {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade < 18){
            System.out.printf("Você tem %d anos e é menor de idade!!", idade);
        } else if (idade >= 18 && idade < 60) {
            System.out.printf("Você tem %d anos e é maior de idade!!",idade);
        } else {
            System.out.printf("Você tem %d anos e é idoso!!", idade);
        }
    }
}
