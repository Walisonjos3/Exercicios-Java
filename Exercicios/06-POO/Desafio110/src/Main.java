/*
Criar um programa com menu:

========= MENU =========

1 - Cadastrar números
2 - Mostrar vetor
3 - Mostrar maior valor
4 - Mostrar menor valor
5 - Mostrar média
6 - Mostrar soma
7 - Contar pares
8 - Contar ímpares
9 - Procurar número
0 - Encerrar

Regras:
utilizar vetores;
utilizar métodos;
utilizar switch;
utilizar do-while;
utilizar for;
deixar a main() apenas chamando métodos;
organizar o código em mais de uma classe.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int escolha;

        do {
            System.out.print("""
                
                ========= MENU =========
                
                1 - Cadastrar números
                2 - Mostrar números
                3 - Mostrar maior valor
                4 - Mostrar menor valor
                5 - Mostrar média
                6 - Mostrar soma
                7 - Contar pares
                8 - Contar ímpares
                9 - Procurar número
                0 - Encerrar
                
                """);

            System.out.print("Digite aqui: ");
            escolha = input.nextInt();

            switch (escolha){
                case 1:
                    numeros = Sistema.cadastrarNumeros(input, numeros);
                    break;

                case 2:
                    String resultado = Sistema.mostrarVetor(numeros);
                    System.out.println(resultado);
                    break;

                case 3:
                    int maiorNumero = Sistema.mostrarMaiorValor(numeros);
                    System.out.printf("O maior número digitado foi: %d%n", maiorNumero);
                    break;

                case 4:
                    int menorNumero = Sistema.mostrarMenorValor(numeros);
                    System.out.printf("o menor número digitado foi: %d%n", menorNumero);
                    break;

                case 5:
                    double mediaNumeros = Sistema.mostrarMedia(numeros);
                    System.out.printf("A média dos números digitados foi: %.2f%n", mediaNumeros);
                    break;

                case 6:
                    int somaNumeros = Sistema.somaVetor(numeros);
                    System.out.printf("A soma dos números digitados foi: %d%n", somaNumeros);
                    break;

                case 7:
                    int totalPares = Sistema.contarPares(numeros);
                    System.out.printf("Total de pares digitados: %d%n", totalPares);
                    break;

                case 8:
                    int totalImpares = Sistema.contarImpares(numeros);
                    System.out.printf("Total de ímpares digitados: %d%n", totalImpares);
                    break;

                case 9:
                    System.out.print("Digite o número desejado: ");
                    int numeroParaProcurar = input.nextInt();
                    String numeroExiste = Sistema.procurarNumero(numeros, numeroParaProcurar);
                    System.out.println(numeroExiste);
                    break;

                case 0:
                    System.out.println("   <<<  ENCERRANDO  >>>");
                    break;

                default:
                    System.out.print("\nERRO: OPÇÃO INVÁLIDA!!\n");
            }
        }while (escolha != 0);

        input.close();
    }
}
