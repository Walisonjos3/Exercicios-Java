/*
Ler a quantidade de alunos e guardar todas as notas em um vetor.
Utilize métodos para:
calcular média;
maior nota;
menor nota;
quantidade de aprovados (nota ≥ 7);
quantidade de reprovados.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Double> vetorNotas = new ArrayList<>();
        String resposta;

        System.out.println(" <<< CADASTRO DE NOTAS >>> ");

        do {
            System.out.print("\nDigite uma nota: ");
            vetorNotas.add(input.nextDouble());

            System.out.print("\nQuer continuar ? [S/N]: ");
            resposta = input.next().toUpperCase();
        }while (!resposta.equals("N"));

        int escolha;
        do {

            System.out.print("""
                    
                      <<<  OPCÕES  >>>
                    
                    1 -> Calcular média
                    2 -> Maior nota
                    3 -> Menor nota
                    4 -> Quantidade de aprovados
                    5 -> Quantidade de reprovados
                    6 -> Sair
                    
                    """);

            System.out.print("\nDigite aqui: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    double resultadoMedia = Boletim.calcularMedia(vetorNotas);
                    System.out.printf("A média das notas digitados foi %.2f%n", resultadoMedia);
                    break;

                case 2:
                    double resultadoMaiorNota = Boletim.maiorNota(vetorNotas);
                    System.out.printf("A maior nota digitada foi %.2f%n", resultadoMaiorNota);
                    break;

                case 3:
                    double resultadoMenorNota = Boletim.menorNota(vetorNotas);
                    System.out.printf("A menor nota digitada foi %.2f%n", resultadoMenorNota);
                    break;

                case 4:
                    int totalAlunosAprovados = Boletim.quantidadeAprovados(vetorNotas);
                    System.out.printf("Total de alunos aprovados: %d%n", totalAlunosAprovados);
                    break;

                case 5:
                    int totalAlunosReprovados = Boletim.quantidadeReprovados(vetorNotas);
                    System.out.printf("Total de alunos reprovados: %d%n", totalAlunosReprovados);
                    break;

                case 6:
                    System.out.print(" <<< Saindo >>> ");
                    break;

                default:
                    System.out.print("ERRO: OPÇÃO INVÁLIDA!");

            }
        }while (escolha != 6);

        input.close();

    }
}
