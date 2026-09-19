// Programa para calcular o consumo de combustível. Ler distancia percorrida e o combustível gasto. Por fim, fazer uma média do consumo.

import java.util.Scanner;

public class ConsumoCombustivel {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("CALCULANDO CONSUMO DE COMBUSTÍVEL");

        System.out.print("Distancia percorrida: ");
        int distancia = input.nextInt();
        System.out.print("Combustível gasto: ");
        int litros = input.nextInt();
        float consumo_total = (float) distancia / litros;

        System.out.printf("\nConsumo médio: %.1f Km/l", consumo_total);
    }
}
