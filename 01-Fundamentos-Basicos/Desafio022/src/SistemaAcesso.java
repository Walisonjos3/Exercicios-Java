// Sistema de acesso. Ler usuário, senha e idade. Liberar acesso será permitido somente se: usuário = "admin", senha = "1234", idade ≥ 18

import java.util.Scanner;

public class SistemaAcesso {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Usuário: ");
        String usuario = input.nextLine();
        System.out.print("Senha: ");
        String senha = input.nextLine();
        System.out.print("Idade: ");
        int idade = input.nextInt();

        String acesso = usuario.equals("admin") && senha.equals("1234") && idade >= 18 ? "Acesso liberado!": "Acesso negado!";
        System.out.print(acesso);

    }
}
