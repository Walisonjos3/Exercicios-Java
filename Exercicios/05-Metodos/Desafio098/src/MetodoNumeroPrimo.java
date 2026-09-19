// Criar um método que receba um número e retorne se ele é primo.

import java.util.Scanner;

public class MetodoNumeroPrimo {

    static String VerificarNumPrimo(int numero){
        int quantidadeDivisores = 0;
        String resultado = "";

        for (int i  = 1; i <= numero; i++){
            if (numero % i == 0){
                quantidadeDivisores++;
            }
        }

        if (quantidadeDivisores == 2){
            resultado = "O número " + numero + " é primo!";
        }else {
            resultado = "O número " + numero + " não é primo!";
        }

        return resultado;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        String resultado = VerificarNumPrimo(numero);

        System.out.print("\n" + resultado);

        input.close();
    }
}
