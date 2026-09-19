//Ler usuário e senha. Considere o Usuário: admin e a Senha: 1234 Utilize && para validar o login.

import java.util.Scanner;

public class ValidarLogin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String usuario = input.nextLine();
        System.out.print("Digite a senha: ");
        int senha = input.nextInt();

        String entrada = usuario.equals("admin") && senha == 1234 ? "Acesso liberado!": "Acesso negado!";

        System.out.println(entrada);
    }
}
