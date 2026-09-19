/*
Ler o nome de 10 produtos e suas quantidades.
Crie métodos para:
mostrar estoque;
calcular total de itens;
encontrar o produto com maior quantidade.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<String> produtos = new ArrayList<>();
        List<Integer> quantidadeProdutos = new ArrayList<>();

        System.out.print("   <<<  SISTEMA DE ESTOQUE  >>>\n");
        for (int i = 1; i <= 10; i++){
            System.out.print("\nProduto " + i);
            System.out.print("\nNome do produto: ");
            String nome = input.next();
            produtos.add(nome);
            System.out.print("Unidades de " + nome + ": ");
            quantidadeProdutos.add(input.nextInt());
        }

        int escolha;

        do {
            System.out.print("""
                      
                      <<<   MENU DO ESTOQUE   >>>
                      
                      1 -> Mostrar estoque
                      2 -> Calcular total de itens
                      3 -> Encontrar produto com maior quantidade
                      4 -> Sair
                      
                      """);

            System.out.print("Digite aqui: ");
            escolha = input.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("  <<<  ESTOQUE  >>>");
                    String estoque = Gerenciamento.mostrarEstoque(produtos, quantidadeProdutos);
                    System.out.print("\n" + estoque);
                    break;

                case 2:
                    int totalItens = Gerenciamento.totalDeItens(quantidadeProdutos);
                    System.out.printf("O total de itens no estoque é %d%n", totalItens);
                    break;

                case 3:
                    String produtoMaior = Gerenciamento.produtoMaiorQuantidade(produtos, quantidadeProdutos);
                    System.out.printf("\n" + produtoMaior);
                    break;

                case 4:
                    System.out.print("  <<< Saindo >>>");
                    break;

                default:
                    System.out.print("ERRO: OPÇÃO INVÁLIDA");
            }

        }while (escolha != 4);

        input.close();
    }
}
