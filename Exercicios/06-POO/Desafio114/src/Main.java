/*
Criar uma classe chamada ContaBancaria.
Atributos:
titular
saldo
aberta

Métodos:
abrirConta()
fecharConta()
depositar(double valor)
sacar(double valor)
mostrarConta()

Regras:
Não pode sacar se a conta estiver fechada.
Não pode sacar mais dinheiro do que existe no saldo.
Não pode depositar se a conta estiver fechada.
Ao abrir a conta, o saldo começa em R$ 0,00.
 */

public class Main {

    public static void main(String[] args) {
        ContaBancaria pessoa = new ContaBancaria();

        pessoa.abrirConta();
        pessoa.titular = "Jarismar";
        pessoa.depositar(50);
        pessoa.sacar(25);
        pessoa.mostrarConta();
    }
}
