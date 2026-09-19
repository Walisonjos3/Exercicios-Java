// Ler a idade de uma pessoa e informe a situação eleitoral.
//Menor de 16 →  Não vota, 16 e 17 → Voto opcional, 18 até 69 → Voto obrigatório, 70 ou mais → Voto opcional

import java.util.Scanner;

public class VotoEleitoral {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua  idade: ");
        int idade = input.nextInt();

        if (idade > 0 && idade < 16){
            System.out.printf("Você tem %d anos e não pode votar!", idade);
        } else if (idade <= 17) {
            System.out.printf("Você tem %d anos e tem voto opcional!", idade);
        } else if (idade <= 69) {
            System.out.printf("Você tem %d anos e tem voto obrigatório!", idade);
        }else {
            System.out.printf("Você tem %d anos e tem voto opcional!", idade);
        }
    }
}
