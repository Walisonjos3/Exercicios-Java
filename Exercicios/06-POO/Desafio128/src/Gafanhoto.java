public class Gafanhoto extends Pessoa {

    private String login;
    private int totalVideoAssistidos;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalVideoAssistidos = 0;
    }

    public void mostrarGafanhoto() {
        System.out.println("   <<<  Mostrando gafanhoto  >>>");
        super.mostrarPessoa();
        System.out.printf("Quantidade de vídeos assistidos: %d%n", this.getTotalVideoAssistidos());
        System.out.printf("Login: %s%n", this.getLogin());
    }

    public void viuMaisUm() {
        this.ganharExp();
    }

    public String getLogin() {
        return this.login;
    }

    public int getTotalVideoAssistidos() {
        return this.totalVideoAssistidos;
    }

    protected void setTotalVideoAssistidos(int total) {
        if (total <= 0) {
            System.out.println("Valor inválido!");
        } else {
            this.totalVideoAssistidos = total;
        }
    }

}
