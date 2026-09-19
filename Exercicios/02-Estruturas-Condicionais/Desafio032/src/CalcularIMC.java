// Ler a altura e o peso e calcule o IMC.
// Mostre: Abaixo do peso, Peso normal, Sobrepeso, Obesidade, Obesidade grave

import java.util.Scanner;

public class CalcularIMC {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("CALCULAR IMC");

        System.out.print("Digite seu peso: ");
        double peso = input.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();
        double imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.printf("Seu IMC é %.2f == Abaixo do peso!", imc);
        } else if (imc < 25){
            System.out.printf("Seu IMC é %.2f == Peso normal!", imc);
        } else if (imc < 30) {
            System.out.printf("Seu IMC é %.2f == Sobrepeso!", imc);
        } else if (imc < 35) {
            System.out.printf("Seu IMC é %.2f == Obesidade grau I !", imc);
        } else if (imc < 40) {
            System.out.printf("Seu IMC é %.2f == Obesidade grau II !", imc);
        }else {
            System.out.printf("Seu IMC é %.2f == Obesidade grau III !", imc);
        }
    }
}
