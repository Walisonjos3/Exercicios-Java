import java.util.List;

public class Boletim {

    static double calcularMedia(List<Double> vetor){
        double soma = 0;

        for (double valor: vetor){
            soma += valor;
        }

        double media = soma / vetor.toArray().length;
        return media;
    }

    static double maiorNota(List<Double> vetor){
        double maior = vetor.get(0);

        for (double valor: vetor){
            if (valor > maior){
                maior = valor;
            }
        }
        return maior;
    }

    static double menorNota(List<Double> vetor){
        double menor = vetor.get(0);

        for (double valor: vetor){
            if (valor < menor){
                menor = valor;
            }
        }

        return menor;
    }

    static int quantidadeAprovados(List<Double> vetor){
        int alunosAprovados = 0;

        for (double valor: vetor){ // Aqui eu poderia ter calculado os alunos reprovados também, mas não seria tão util futuramente, igual a fazer seu próprio método.
            if (valor >= 7){
                alunosAprovados++;
            }
        }

        return alunosAprovados;
    }

    static int quantidadeReprovados(List<Double> vetor){
        int alunosReprovados = 0;

        for (double valor: vetor){
            if (valor < 7){
                alunosReprovados++;
            }
        }

        return alunosReprovados;
    }
}
