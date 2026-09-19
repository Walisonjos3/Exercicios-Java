// Ler uma senha e enquanto ela for diferente de: java123
// continue pedindo. Quando acertar: Senha correta!

import java.util.Scanner;

public class SenhaLogin {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = input.next();

        while (!senha.equals("java123")){
            System.out.print("Senha incorreta! Digite novamente: ");
            senha = input.next();
        }
        System.out.print("Senha correta!");
        input.close();
    }
}
