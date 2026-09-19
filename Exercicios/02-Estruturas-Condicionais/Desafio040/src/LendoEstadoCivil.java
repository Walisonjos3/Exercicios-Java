// Ler um estado civil. S, C, D ou V.
//Mostre: Solteiro, Casado, Divorciado ou Viúvo.

import java.util.Scanner;

public class LendoEstadoCivil {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ESTADO CIVIL");

        System.out.printf("\nDigite S | C | D | V para continuar: ");
        String estado_civil = input.nextLine().toUpperCase();

        switch (estado_civil){
            case "S":
                System.out.print("Seu estado civil é Solteiro!");
                break;
            case "C":
                System.out.print("Seu estado civil é Casado!");
                break;
            case "D":
                System.out.print("Seu estado civil é Divorciado!");
                break;
            case "V":
                System.out.print("Seu estado civil é Viúvo!");
                break;
            default:
                System.out.print("ERRO: ESTADO CIVIL INVÁLIDO!!");
        }

    }
}
