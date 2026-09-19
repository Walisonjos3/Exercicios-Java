import java.util.List;
import java.util.Scanner;

public class Sistema {

    static List<Integer> cadastrarNumeros(Scanner input, List<Integer> vetor){
        System.out.print("Quantos números quer cadastrar ? ");
        int quantidade = input.nextInt();

        for (int i = 1; i <= quantidade; i++){
            System.out.print("Digite o " + i + "º número: ");
            vetor.add(input.nextInt());
        }
        List<Integer> resultado = vetor;
        return resultado;
    }

    static String mostrarVetor(List<Integer> vetor){
        String resultado = "";
        resultado = String.format("%n  <<<  MOSTRANDO VETOR  >>>%n%n");

        for (int valor: vetor){
            resultado += String.format("%d%n", valor);
        }

        return resultado;
    }

    static int mostrarMaiorValor(List<Integer> vetor){
        int maior = vetor.get(0);

        for (int valor: vetor){
            if (valor > maior){
                maior = valor;
            }
        }

        return maior;
    }

    static int mostrarMenorValor(List<Integer> vetor){
        int menor = vetor.get(0);

        for (int valor: vetor){
            if (valor < menor){
                menor = valor;
            }
        }

        return menor;
    }

    static double mostrarMedia(List<Integer> vetor){
        int soma = 0;

        for (int valor: vetor){
            soma += valor;
        }

        double media = (double) soma / vetor.toArray().length;
        return media;
    }

    static int somaVetor(List<Integer> vetor){
        int soma = 0;

        for (int valor: vetor){
            soma += valor;
        }

        return soma;
    }

    static int contarPares(List<Integer> vetor){
        int quantidadePares = 0;

        for (int valor: vetor){
            if (valor % 2 == 0){
                quantidadePares++;
            }
        }

        return quantidadePares;
    }

    static int contarImpares(List<Integer> vetor){
        int quantidadeImpares = 0;

        for (int valor: vetor){
            if (valor % 2 != 0){
                quantidadeImpares++;
            }
        }

        return quantidadeImpares;
    }

    static String procurarNumero(List<Integer> vetor, int numero){
        String resultado = "";
        int posicao = 0;
        int contador = 0;

        if (vetor.contains(numero)){
            for (int valor: vetor){
                if (valor == numero){
                    posicao = contador;
                }

                contador++;
            }

            resultado = String.format("O número está na posição %d", posicao);
            return resultado;

        }else {
            resultado = "O número não está na lista";
            return resultado;
        }
    }
}
