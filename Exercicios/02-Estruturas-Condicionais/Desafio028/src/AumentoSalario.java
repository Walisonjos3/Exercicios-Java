// Ler o salário de um funcionário. Conceda aumento conforme a tabela: Até R$1500 → 15%, até R$3000 → 10% e acima disso → 5%. Por fim, mostre o novo salário.

import java.util.Scanner;

public class AumentoSalario {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu salário: ");
        double salario = input.nextDouble();

        if (salario > 0 && salario <= 1500){
            double aumento = salario * 15 / 100;
            double novo_salario = salario + aumento;
            System.out.printf("Salário anterior: R$ %.2f", salario);
            System.out.printf("\nNovo salário com aumento de R$ 15%%: %.2f", novo_salario);
        } else if (salario <= 3000) {
            double aumento = salario * 10 / 100;
            double novo_salario = salario + aumento;
            System.out.printf("Salário anterior: R$ %.2f", salario);
            System.out.printf("\nNovo salário com aumento de 10%%: %.2f", novo_salario);
        }else{

            double aumento = salario * 5 / 100;
            double novo_salario = salario + aumento;
            System.out.printf("Salário anterior: R$ %.2f", salario);
            System.out.printf("\nNovo salário com aumento de 5%%: R$ %.2f", novo_salario);

        }
    }
}
