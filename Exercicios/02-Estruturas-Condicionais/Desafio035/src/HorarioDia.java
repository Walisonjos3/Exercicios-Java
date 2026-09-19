// Ler um caractere M, V ou N
// Mostre: Matutino, Vespertino ou Noturno.

import java.util.Scanner;

public class HorarioDia {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite M | V | N para continuar!");

        System.out.print("\nDigite aqui: ");
        String letra = input.next().toUpperCase();

        switch (letra){
            case "M":
                System.out.printf("%s corresponde a Matutino!", letra);
                break;
            case "V":
                System.out.printf("%s corresponde a Vespertino!", letra);
                break;
            case "N":
                System.out.printf("%s corresponde a Noturno!", letra);
                break;
            default:
                System.out.printf("%s não corresponde a nenhum horário do dia!", letra);
        }

        input.close();
    }
}
