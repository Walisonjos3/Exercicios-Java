import com.sun.source.tree.BreakTree;

import java.util.List;

public class Gerenciamento {

    static String mostrarEstoque(List<String> vetorNomes, List<Integer> vetorQuantidade){
        String resultado = "";
        int contador = 0;

        for (String nome: vetorNomes){
            resultado += nome + " tem " + vetorQuantidade.get(contador) + " unidades em estoque\n";
            contador++;
        }

        return resultado;
    }

    static int totalDeItens(List<Integer> quantidadeProdutos){
        int soma = 0;

        for (int valor: quantidadeProdutos){
            soma += valor;
        }

        return soma;
    }

    static String produtoMaiorQuantidade(List<String> produtos, List<Integer> quantidadeProdutos){
        int totalProdutos = quantidadeProdutos.get(0);
        int posicaoMaior = 0;
        int contador = 0;

        for (int quantidade: quantidadeProdutos){
            if (quantidade > totalProdutos){
                totalProdutos = quantidade;
                posicaoMaior = contador;
            }

            contador++;
        }

        String produtoMaiorQuantidade = produtos.get(posicaoMaior);
        String resultado = "Produto com maior quantidade: " + produtoMaiorQuantidade + " Com " + totalProdutos + " unidades\n";
        return resultado;
    }
}
