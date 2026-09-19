public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private double saldo;
    private boolean contaAtiva;

    public ContaBancaria(String nome, int numeroConta) {
        this.titular = nome;
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.contaAtiva = false;
    }

    public String getTitular() {
        return this.titular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean getContaAtiva() {
        return this.contaAtiva;
    }

    public void mostrarConta() {
        System.out.println("========== CONTA ===========");
        System.out.printf("Titular: %s%n", getTitular());
        System.out.printf("Número: %d%n", getNumeroConta());
        System.out.printf("Saldo: R$ %.2f%n", getSaldo());
        System.out.printf("Conta ativa ? %b%n", getContaAtiva());
        System.out.println("============================\n");
    }

    public void depositar(double valor) {
        if (this.contaAtiva) {
            if (valor <= 0) {
                System.out.println("Impossível depositar valores menores ou iguais a zero!");
            } else {
                this.saldo += valor;
                System.out.println("Deposito realizado com sucesso!");
            }
        } else {
            System.out.println("Conta desativada: impossível depositar!");
        }
    }

    public void sacar(double valor) {
        if (this.contaAtiva) {
            if (valor > getSaldo() || valor <= 0) {
                System.out.println("Saldo insuficiente para sacar ou valor não permitido!");
            } else {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            }
        } else {
            System.out.println("Conta desativada: impossível sacar!");
        }
    }

    public void ativarConta() {
        if (this.contaAtiva) {
            System.out.println("A conta ja está ativa!");
        } else {
            this.contaAtiva = true;
            System.out.println("Conta ativa com sucesso!");
        }
    }

    public void desativarConta() {
        if (!this.contaAtiva) {
            System.out.println("A conta já está desativada!");
        } else if (this.saldo == 0) {
            this.contaAtiva = false;
            System.out.println("Conta desativada com sucesso!");
        } else {
            System.out.println("Impossível desativar a conta com saldo ou conta em débito!");
        }
    }


}
