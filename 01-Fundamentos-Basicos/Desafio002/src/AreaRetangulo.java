// Programa para calcular área de um retângulo.

import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("=== CALCULAR ÁREA RETÂNGULO ===");
        System.out.print("Digite a Base: ");
        int base = input.nextInt();
        System.out.print("Digite a Altura: ");
        int altura = input.nextInt();
        int area = base * altura;
        System.out.printf("Área = %s", area); input.close();
    }
}
