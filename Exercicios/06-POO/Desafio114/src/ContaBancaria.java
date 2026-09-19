public class ContaBancaria {

    public String titular;
    private double saldo;
    private boolean aberta;

    public void mostrarConta(){
        if (this.aberta){
            System.out.printf("Titular: %s%n", this.titular);
            System.out.printf("Saldo: R$ %.2f%n", this.saldo);
            System.out.printf("Conta Aberta ? %b%n", this.aberta);
        } else {
            System.out.println("Sua conta está fechada!!");
        }
    }

    public void abrirConta(){
        this.aberta = true;
        this.saldo = 0.00;
    }

    public void fecharConta(){
        this.aberta = false;
    }

    public void depositar(double valor){
        if (this.aberta){
            this.saldo += valor;
        } else {
            System.out.println("Conta fechada para depositar!!");
        }
    }

    public void sacar(double valor){
        if (this.aberta){
            if (this.saldo >= valor){
                this.saldo -= valor;
            } else {
                System.out.println("Saldo insuficiente para sacar esse valor!!");
            }

        } else {
            System.out.println("Conta fechada para sacar!!");
        }
    }

}
