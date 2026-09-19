/* Crie um sistema utilizando tudo o que foi estudado.

   ========================

   1 - Cadastrar nota
   2 - Mostrar média
   3 - Mostrar maior nota
   4 - Mostrar menor nota
   5 - Mostrar quantidade de notas
   6 - Encerrar

========================

Enquanto o usuário não escolher 6, o sistema permanece executando.

Utilize:

while
do...while
for
if
switch
break
continue
operadores relacionais
operadores lógicos
operador ternário (quando fizer sentido)

 */

import java.util.Scanner;

public class SistemaGerenciamentoNotas {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int escolha;
        double nota = 0;
        double soma = 0;
        double maior_nota = 0;
        double menor_nota = 0;
        int quantidade_notas = 0;

        do {
            System.out.print("""
                    
                    ==============================
                    
                    1 - Cadastrar nota
                    2 - Mostrar média
                    3 - Mostrar maior nota
                    4 - Mostrar menor nota
                    5 - Mostrar quantidade de notas
                    6 - Encerrar
                    
                    ==============================
                    """);

            System.out.print("Digite aqui: ");
            escolha = input.nextInt();

            switch (escolha){
                case 1:
                    System.out.print("Digite uma nota: ");
                    nota = input.nextDouble();
                    soma += nota;

                    if (quantidade_notas == 0){
                        maior_nota = nota;
                        menor_nota = nota;
                    }else {

                        if (nota > maior_nota){
                            maior_nota = nota;
                        }if (nota < menor_nota){
                            menor_nota = nota;
                        }
                    }
                    quantidade_notas++;
                    break;
                case 2:
                    double media = soma / (double) quantidade_notas;
                    System.out.printf("A média das notas digitadas é %.1f", media);
                    break;
                case 3:
                    System.out.printf("A maior nota digitado foi %.1f", maior_nota);
                    break;
                case 4:
                    System.out.printf("A menor nota digitada foi %.1f", menor_nota);
                    break;
                case 5:
                    System.out.printf("A quantidade de notas digitadas é %d", quantidade_notas);
                    break;
                case 6:
                    System.out.print("Encerrando...");
                    break;
                default:
                    System.out.print("ERRO: OPÇÃO INVÁLIDA!!");
            }
        }while (escolha != 6);
    }
}
