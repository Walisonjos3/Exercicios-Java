import java.util.List;

public class PesquisaIdade {

    static double mediaIdades(List<Integer> vetor){
        int soma = 0;

        for (int valor: vetor){
            soma += valor;
        }

        double mediaIdades = soma / vetor.toArray().length;
        return mediaIdades;
    }

    static int maiorIdade(List<Integer> vetor){
        int maiorIdade = vetor.get(0);

        for (int idade: vetor){
            if (idade > maiorIdade){
                maiorIdade = idade;
            }
        }

        return maiorIdade;
    }

    static int menorIdade(List<Integer> vetor){
        int menorIdade = vetor.get(0);

        for (int idade: vetor){
            if (idade < menorIdade){
                menorIdade = idade;
            }
        }

        return menorIdade;
    }

    static int maioresIdades(List<Integer> vetor){
        int quantidadeMaiores = 0;

        for (int idade: vetor){
            if (idade >= 18){
                quantidadeMaiores++;
            }
        }

        return quantidadeMaiores;
    }

    static int menoresIdades(List<Integer> vetor){
        int quantidadeMenores = 0;

        for (int idade: vetor){
            if (idade < 18){
                quantidadeMenores++;
            }
        }

        return quantidadeMenores;
    }
}
