/*
Criar classe secundária Conta.
A conta deverá possuir: titular, número da conta, saldo e conta ativa.

Regras:
1. O titular e o número da conta devem ser informados no construtor.
2. O saldo começa em 0.
3. A conta começa inativa.
 */

public class Main {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Walison", 12345);

        conta.mostrarConta();
        conta.depositar(100);
        conta.ativarConta();
        conta.depositar(100);
        conta.mostrarConta();
        conta.sacar(30);
        conta.mostrarConta();
    }
}
