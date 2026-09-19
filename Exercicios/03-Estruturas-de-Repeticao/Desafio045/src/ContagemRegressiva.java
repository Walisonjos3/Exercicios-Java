// Utilizar um while para mostrar os números de 10 até 1.
// Ao final, mostre: FIM!

public class ContagemRegressiva {

    public static void main(String[] args){
        int i = 10;
        while (i >= 1){
            System.out.printf("%d\n", i);
            i--;
        }
        System.out.print("FIM!");
    }
}
