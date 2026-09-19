// Criar um método que receba uma idade e retorne: Criança, Adolescente, Adulto ou Idoso.

import java.util.Scanner;

public class MetodoIdade {

    static String VerificarIdade(int idade){
        String verifica;

        if (idade < 12){
            verifica = "Criança";
        } else if (idade < 18) {
            verifica = "Adolescente";
        } else if (idade < 60) {
            verifica = "Adulto";
        }else {
            verifica = "Idoso";
        }

        return verifica;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        String resultado = VerificarIdade(idade);

        System.out.printf("\nCom %d anos é %s", idade, resultado);

        input.close();
    }
}
