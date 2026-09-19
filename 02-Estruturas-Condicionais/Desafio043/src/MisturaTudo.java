/*
Faça um programa que reúna todos os conteúdos anteriores.
Cada opção deve utilizar os conceitos estudados:

if/else
switch
operador ternário
operadores relacionais
operadores lógicos
.equals()
 */

import java.util.Scanner;

public class MisturaTudo {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("""
                ===== MENU =====
                
                1 - Verificar maior número
                2 - Calcular média
                3 - Verificar idade
                4 - Calculadora
                5 - Login
                6 - Dia da semana
                7 - Sair""");


        System.out.print("\n\nEscolha: ");
        int escolha = input.nextInt();


        switch (escolha){
            case 1:
                System.out.println("VERIFICANDO MAIOR NÚMERO");
                System.out.print("\nDigite um número: ");
                int n1 = input.nextInt();
                System.out.print("Digite outro número: ");
                int n2 = input.nextInt();
                System.out.print("Digite mais um número: ");
                int n3 = input.nextInt();

                int maior = n1;

                if (n2 > maior){
                    maior = n2;
            }   if (n3 > maior ){
                    maior = n3;
                }

                System.out.printf("O maior número entre [ %d, %d, %d ] é %d", n1, n2, n3, maior);
                break;
            case 2:
                System.out.println("CAlCULANDO MÉDIA");
                System.out.print("\nDigite uma nota: ");
                double nota1 = input.nextDouble();
                System.out.print("Digite outra nota: ");
                double nota2 = input.nextDouble();

                double media = (nota1 + nota2) / 2;
                System.out.printf("A média entre %.1f e %.1f é %.1f", nota1, nota2, media);
                break;
            case 3:
                System.out.println("VERIFICANDO IDADE");
                System.out.print("\nDigite sua idade: ");
                int idade = input.nextInt();

                String resultado = idade >= 18 ? "Maior de idade": "Menor de idade";

                System.out.printf("Sua idade é %d e você é %s", idade, resultado);
                break;
            case 4:
                System.out.print("""
                        CALCULADORA
                        
                        1 -> +
                        2 -> -
                        3 -> *
                        4 -> /
                        
                        """);

                System.out.print("Digite aqui: ");
                int operacao = input.nextInt();

                if (operacao == 1){
                    System.out.println("OPERAÇÃO ESCOLHIDA: [ + ]");
                    System.out.print("\nDigite um número: ");
                    int numero1 = input.nextInt();
                    System.out.print("Digite outro número: ");
                    int numero2 = input.nextInt();

                    int soma = numero1 + numero2;

                    System.out.printf("A soma entre %d e %d é %d", numero1, numero2, soma);
                } else if (operacao == 2) {
                    System.out.println("OPERAÇÃO ESCOLHIDA: [ - ]");
                    System.out.print("\nDigite um número: ");
                    int numero1 = input.nextInt();
                    System.out.print("Digite outro número: ");
                    int numero2 = input.nextInt();

                    int subtracao = numero1 - numero2;

                    System.out.printf("A subtração entre %d e %d é %d", numero1, numero2, subtracao);
                } else if (operacao == 3) {
                    System.out.println("OPERAÇÃO ESCOLHIDA: [ * ]");
                    System.out.print("\nDigite um número: ");
                    int numero1 = input.nextInt();
                    System.out.print("Digite outro número: ");
                    int numero2 = input.nextInt();

                    int multiplicacao = numero1 * numero2;

                    System.out.printf("A multiplicação entre %d e %d é %d", numero1, numero2, multiplicacao);
                } else if (operacao == 4) {
                    System.out.println("OPERAÇÃO ESCOLHIDA: [ / ]");
                    System.out.print("\nDigite um número: ");
                    double numero1 = input.nextInt();
                    System.out.print("Digite outro número: ");
                    double numero2 = input.nextInt();

                    double divisao = numero1 / numero2;

                    System.out.printf("A divisao entre %.1f e %.1f é %.1f", numero1, numero2, divisao);
                }else {
                    System.out.print("ERRO: OPERAÇÃO INVÁLIDA!");
                }
                break;
            case 5:
                input.nextLine();
                System.out.println("<<< LOGIN >>>");
                System.out.print("Digite o usuário: ");
                String usuario_entrada = input.nextLine().toLowerCase();

                System.out.print("Digite a senha: ");
                String senha = input.nextLine();

                String entrada = (usuario_entrada.equals("admin") && senha.equals("admin123")) ? "LOGIN COM SUCESSO!": "ERRO: ENTRADA INVÁLIDA!";

                System.out.print(entrada);
                break;
            case 6:
                System.out.print("""
                        DIAS DA SEMANA
                        
                        Digite um número entre [ 1 e 7 ]
                        
                        """);

                System.out.print("Digite aqui: ");
                int dia = input.nextInt();

                switch (dia){
                    case 1:
                        System.out.printf("O dia %d corresponde a domingo!\n", dia);
                        break;
                    case 2:
                        System.out.printf("O dia %d corresponde a segunda-feira!\n", dia);
                        break;
                    case 3:
                        System.out.printf("O dia %d corresponde a terça-feira!\n", dia);
                        break;
                    case 4:
                        System.out.printf("O dia %d corresponde a quarta-feira!\n", dia);
                        break;
                    case 5:
                        System.out.printf("O dia %d corresponde a quinta-feira!\n", dia);
                        break;
                    case 6:
                        System.out.printf("O dia %d corresponde a sexta-feira!\n", dia);
                        break;
                    case 7:
                        System.out.printf("O dia %d corresponde a sábado!\n", dia);
                        break;
                    default:
                        System.out.print("ERRO: O VALOR DIGITADO NÃO CORRESPONDE A NENHUM DIA DA SEMANA!\n");
                        break;
                }
                break;
            case 7:
                System.out.print("Saindo... Volte sempre!");
                break;
            default:
                System.out.print("ERRO: OPÇÃO INVÁLIDA!");
        }
        input.close();
    }
}
