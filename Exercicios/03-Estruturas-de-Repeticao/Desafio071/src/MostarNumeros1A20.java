// Mostrar os números de 1 a 20.
// Ignorar os múltiplos de 3 usando continue.

public class MostarNumeros1A20 {

    public static void main(String[] args){

        for (int i = 1; i <= 20; i++){
            if (i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
