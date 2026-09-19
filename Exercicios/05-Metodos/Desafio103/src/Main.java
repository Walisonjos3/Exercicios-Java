// Criar uma classe secundária chamada Utilidades e adicionar todos os métodos anteriores dentro dela.
// Na classe Principal, utilizar todos eles.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> vetorSoma = new ArrayList<>();
        List<Integer> vetorMaior = new ArrayList<>();


        System.out.println(" <<< MÉTODO 1 >>> ");

        System.out.print("\nDigite um número: ");
        int numero1 = input.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = input.nextInt();
        System.out.printf("A soma entre %d e %d é %d\n\n", numero1, numero2, Utilidades.somandoDoisNumeros(numero1, numero2));


        System.out.println(" <<< MÉTODO 2 >>> ");

        System.out.print("\nDigite um número: ");
        int numero3 = input.nextInt();
        System.out.print("Digite outro número: ");
        int numero4 = input.nextInt();
        System.out.printf("A multiplicação entre %d e %d é %d\n\n", numero3, numero4, Utilidades.multiplicandoDoisNumeros(numero3, numero4));


        System.out.println(" <<< MÉTODO 3 >>> ");

        System.out.print("\nDigite um número: ");
        int numeroDobro = input.nextInt();
        System.out.printf("O dobro de %d é %d\n\n", numeroDobro, Utilidades.dobrarNumero(numeroDobro));


        System.out.println(" <<< MÉTODO 4 >>> ");

        System.out.print("\nDigite um número: ");
        int numero_par_impar = input.nextInt();
        System.out.println(Utilidades.numeroParImpar(numero_par_impar));


        System.out.println("\n <<< MÉTODO 5 >>> ");

        System.out.print("\nDigite um número: ");
        int numero_quadrado = input.nextInt();
        System.out.printf("O quadrado de %d é %d\n\n", numero_quadrado, Utilidades.quadradoNumero(numero_quadrado));


        System.out.println(" <<< MÉTODO 6 >>> ");

        System.out.print("\nDigite um número: ");
        int n1 = input.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = input.nextInt();
        System.out.print("Digite mais um número: ");
        int n3  = input.nextInt();
        System.out.printf("O maior número entre [ %d, %d, %d ] é %d\n\n", n1, n2, n3, Utilidades.maiorNumeroEmTres(n1, n2, n3));

        System.out.println(" <<< MÉTODO 7 >>> ");

        System.out.print("\nDigite sua idade: ");
        int idade = input.nextInt();
        System.out.println(Utilidades.verificandoIdade(idade));


        System.out.println("\n <<< MÉTODO 8 >>> ");

        System.out.print("\nDigite um número: ");
        int numeroFatorial = input.nextInt();
        System.out.printf("O fatorial de %d é %d\n\n", numeroFatorial, Utilidades.fatorial(numeroFatorial));


        System.out.println(" <<< MÉTODO 9 >>> ");

        System.out.print("\nDigite um número: ");
        int numeroPrimo = input.nextInt();
        System.out.println(Utilidades.verificarNumeroPrimo(numeroPrimo));


        System.out.println("\n <<< MÉTODO 10 >>> ");

        System.out.print("\nDigite um número: ");
        int numero1maior = input.nextInt();
        System.out.print("Digite outro número: ");
        int numero2maior = input.nextInt();
        System.out.printf("O maior número entre [ %d e %d ] é %d\n\n", numero1maior, numero2maior, Utilidades.maiorEmDoisNumeros(numero1maior, numero2maior));


        System.out.println(" <<< MÉTODO 11 >>> ");

        System.out.print("\nDigite um inicio: ");
        int inicio = input.nextInt();
        System.out.print("Digite um fim: ");
        int fim = input.nextInt();
        System.out.println("Sequência: " + Utilidades.contador(inicio, fim));


        System.out.println("\n <<< MÉTODO 12 >>> ");
        int numeroVetor;
        String resposta1 = "";

        do {
            System.out.print("\nDigite um número: ");
            numeroVetor = input.nextInt();
            vetorSoma.add(numeroVetor);

            System.out.print("\nQuer continuar ? [S/N]: ");
            resposta1 = input.next().toUpperCase();
        }while (!resposta1.equals("N"));

        System.out.printf("A soma dos números digitados é %d\n\n", Utilidades.somandoVetor(vetorSoma));


        System.out.println(" <<< MÉTODO 13 >>> ");
        int numeroMaiorVetor;
        String resposta2 = "";

        do {
            System.out.print("\nDigite um número: ");
            numeroMaiorVetor = input.nextInt();
            vetorMaior.add(numeroMaiorVetor);

            System.out.print("\nQuer continuar ? [S/N]: ");
            resposta2 = input.next().toUpperCase();
        }while (!resposta2.equals("N"));

        System.out.printf("O maior número digitado foi %d", Utilidades.maiorNumeroVetor(vetorMaior));

        input.close();

    }
}
