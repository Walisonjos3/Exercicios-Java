// Criar um método que receba dois números e retorne qual deles é maior.

import java.util.Scanner;

public class MetodoMaiorNumero {

    static int numeroMaior(int n1, int n2){

        if (n1 > n2){
            return n1;
        }else {
            return n2;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = input.nextInt();
        System.out.print("Digite um número: ");
        int numero2 = input.nextInt();

        int resultado = numeroMaior(numero1, numero2);

        System.out.printf("\nO maior número digitado é %d", resultado);

        input.close();
    }
}
