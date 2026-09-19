// Mostrar apenas os números ímpares entre 1 e 99.

public class NumerosImparEntre1E99 {

    public static void main(String[] args){

        for (int i = 1; i <= 99; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
