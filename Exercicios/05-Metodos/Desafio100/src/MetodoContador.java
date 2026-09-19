// Criar um método chamado contador() que receba início e fim e retorne uma String com toda a contagem.
// Exemplo: 1 2 3 4 5

import java.util.Scanner;

public class MetodoContador {

    static String contador(int inicio, int fim){
        int c = 0;
        String resultado = "";

        if (fim < inicio){
            c = fim;
            fim = inicio;
            inicio = c;
        }

        for (int i = inicio; i <= fim; i++){
            resultado += i + " ";
        }

        return resultado;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um inicio: ");
        int inicio = input.nextInt();
        System.out.print("Digite um fim: ");
        int fim = input.nextInt();

        String resultado = contador(inicio, fim);

        System.out.print("\n" + resultado);

        input.close();
    }
}
