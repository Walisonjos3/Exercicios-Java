import java.util.List;
import java.util.Scanner;

public class Utilidades {

    public static int somandoDoisNumeros(int n1, int n2){
        int soma = n1 + n2;
        return soma;
    }

    public static int multiplicandoDoisNumeros(int n1, int n2){
        int multiplica = n1 * n2;
        return multiplica;
    }

    public static int dobrarNumero(int numero){
        int dobro = numero * 2;
        return numero * 2;
    }

    public static String numeroParImpar(int numero){
        String resultado = "";

        if (numero % 2 == 0){
            resultado = "O número " + numero + " é par!";
        }else {
            resultado = "O número " + numero + " é ímpar!";
        }

        return resultado;
    }

    public static int quadradoNumero(int numero){
        int quadrado = numero * numero;
        return quadrado;
    }

    public static int maiorNumeroEmTres(int n1, int n2, int n3){
        int maior = n1;

        if (n2 >  maior){
            maior = n2;
        }if (n3 > maior){
            maior = n3;
        }

        return maior;
    }

    public static String verificandoIdade(int idade){
        String resultado = "";

        if (idade < 12){
            resultado = "Com " + idade + " anos é criança";
        } else if (idade < 18) {
            resultado = "Com " + idade + " anos é adolescente";
        } else if (idade < 60) {
            resultado = "Com " + idade + " anos é adulto";
        }else {
            resultado = "Com " + idade + " anos é idoso";
        }

        return resultado;
    }

    public static int fatorial(int numero){
        int fatorial = 1;

        for (int i = 1; i <= numero; i++){
            fatorial *= i;
        }

        return fatorial;
    }

    public static String verificarNumeroPrimo(int numero){
        int quantidadeDivisores = 0;
        String resultado = "";

        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                quantidadeDivisores++;
            }
        }

        if (quantidadeDivisores == 2){
            resultado = "O número " + numero + " é primo!";
        }else {
            resultado = "O número " + numero + " não é primo!";
        }

        return resultado;
    }

    public static int maiorEmDoisNumeros(int n1, int n2){

        if (n1 > n2){
            return n1;
        }else {
            return n2;
        }
    }

    public static String contador(int inicio, int fim){
        int c = 0;
        String resultado = "";

        if (fim < inicio){
            c = fim;
            fim = inicio;
            inicio = c;
        }

        for (int i = inicio; i <= fim; i++){
            resultado += i + " ";
        }

        return resultado;
    }

    public static int somandoVetor(List<Integer> vetor){
        int soma = 0;

        for (int valor: vetor){
            soma += valor;
        }

        return soma;
    }

    public static int maiorNumeroVetor(List<Integer> vetor){
        int maior = vetor.get(0);

        for (int valor: vetor){
            if (valor > maior){
                maior = valor;
            }
        }

        return maior;

    }

}
