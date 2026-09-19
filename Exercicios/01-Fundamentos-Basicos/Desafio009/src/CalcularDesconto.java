/* Programa para calcular desconto de um produto. Ler nome, preço e o desconto.
   Por fim, calcular o valor do desconto e valor final.
 */

import java.util.Scanner;

public class CalcularDesconto {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("CALCULANDO DESCONTO");

        System.out.print("Nome do produto: ");
        String nome = input.nextLine();
        System.out.printf("Preço do %s: R$ ", nome);
        float preco = input.nextFloat();
        System.out.print("Porcentagem do desconto: ");
        int desconto = input.nextInt();
        float valor_com_desconto = preco * desconto / 100;
        float valor_total = preco - valor_com_desconto;

        System.out.printf("\nProduto: %s", nome);
        System.out.printf("\nPreço: R$ %.2f", preco);
        System.out.printf("\nDesconto: %s%%", desconto);
        System.out.printf("\nValor do desconto: R$ %.2f", valor_com_desconto);
        System.out.printf("\nValor final: R$ %.2f", valor_total);
    }
}
