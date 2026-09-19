// Pergunte: Deseja continuar?
// S/N; Enquanto responder S, continue.

import java.util.Scanner;

public class DesejaContinuar {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Deseja continuar ? [S/N]: ");
            resposta = input.next().toUpperCase();
        }while (!resposta.equals("N"));
    }
}
