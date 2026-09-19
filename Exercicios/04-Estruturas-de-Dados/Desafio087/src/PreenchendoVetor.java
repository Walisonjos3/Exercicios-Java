// Criar um vetor de 15 posições.
// Utilize Arrays.fill() para preencher todas as posições com o número 100.
// Depois mostre o vetor.

import java.util.Arrays;

public class PreenchendoVetor {

    public static void main(String[] args){
        int numeros[] = new int[15];

        Arrays.fill(numeros, 100);
        for (int valor: numeros){
            System.out.println(valor);
        }
    }
}
