// Ler duas palavras e verifique se são iguais utilizando .equals().

import java.util.Scanner;

public class VerificarPalavras {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra1 = input.nextLine();
        System.out.print("Digite outra palavra: ");
        String palavra2 = input.nextLine();

        String verificarPalavra = palavra1.equals(palavra2) ? "As palavras são iguais!" : "As palavras não são iguais!";
        System.out.println(verificarPalavra);
    }
}

