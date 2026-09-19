import java.util.Scanner;

public class Sistema {

    static double depositar(Scanner input){
        System.out.print("\nValor do deposito: ");
        double saldo = input.nextDouble();

        return saldo;
    }

    static double sacar(Scanner input){
        System.out.print("\nValor do saque: ");
        double saque = input.nextDouble();

        return saque;
    }

    static String mostrarSaldo(double saldo){
        String resultado = "";
        resultado = String.format("%nSaldo: R$ %.2f", saldo);

        return resultado;
    }
}
