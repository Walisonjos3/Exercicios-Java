// Criar um vetor com 8 números e calcular a soma de todos os valores.

public class SomandoElementosVetor {

    public static void main(String[] args){
        int vetor[] = {4, 3, 2, 1, 5, 6, 7, 9};
        int soma = 0;

        for (int valor: vetor){
            soma += valor;
        }
        System.out.printf("A soma dos valores é %d", soma);
    }
}
