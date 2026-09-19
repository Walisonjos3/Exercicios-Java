// Mostrar os números de 1 a 100.
// Quando chegar em 55, utilize break.

public class MostrarNumeros1A100 {

    public static void main(String[] args){

        for (int i = 1; i <= 100; i++){
            if (i == 55){
                break;
            }
            System.out.println(i);
        }
    }
}
