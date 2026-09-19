// Programa para converter segundos em horas, minutos e os segundos restantes.

import java.util.Scanner;

public class ConversorSegundos {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("CONVERSOR DE SEGUNDOS");

        System.out.print("Segundos: ");
        int segundos = input.nextInt();

        int horas = segundos / 3600;
        int segundos_restantes = segundos % 3600;
        int minutos = segundos_restantes / 60;
        segundos_restantes %= 60;

        System.out.printf("\n%d horas", horas);
        System.out.printf("\n%d minutos", minutos);
        System.out.printf("\n%d Segundos", segundos_restantes);
    }
}
