// Criar um sistema de login. Usuário: admin, Senha: 1234
// O usuário possui apenas 3 tentativas. Após errar três vezes: Sistema bloqueado.

import java.util.Scanner;

public class SistemaLogin {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("SISTEMA DE LOGIN");

        System.out.print("\nUsuário: ");
        String usuario = input.next();

        System.out.print("Senha: ");
        int senha = input.nextInt();
        int tentativa = 1;

        if (usuario.equals("admin") && senha == 1234){
            System.out.print("Sistema liberado!");
        }else {
            while (tentativa <= 3) {
                System.out.printf("SENHA INCORRETA!!");
                System.out.print("\nUsuário: ");
                usuario = input.next();

                System.out.print("Senha: ");
                senha = input.nextInt();
                tentativa++;
            }
            System.out.print("Sistema bloqueado!");
        }
        input.close();
    }
}
