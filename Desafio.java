import java.util.Scanner;

public class Desafio {
    public static void main(String[] args){
        String nome = "Saori Kido";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("**************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n**************************");

        int opcao = 0;
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            
            // Verifica se a entrada é um número
            if (leitura.hasNextInt()) {
                opcao = leitura.nextInt();

                switch(opcao) {
                    case 1:
                        System.out.println("O saldo atualizado é " + saldo);
                        break;
                    case 2:
                        System.out.println("Qual o valor que deseja transferir?");
                        if (leitura.hasNextDouble()) {
                            double valor = leitura.nextDouble();
                            if (valor > saldo){
                                System.out.println("Não há saldo para realizar a transferência.");
                            } else {
                                saldo -= valor;
                                System.out.println("Novo saldo: " + saldo);
                            }
                        } else {
                            System.out.println("Valor inválido!");
                            leitura.next();  // Limpa o buffer
                        }
                        break;
                    case 3:
                        System.out.println("Valor recebido: ");
                        if (leitura.hasNextDouble()) {
                            double valor = leitura.nextDouble();
                            saldo += valor;
                            System.out.println("Novo saldo: " + saldo);
                        } else {
                            System.out.println("Valor inválido!");
                            leitura.next();  // Limpa o buffer
                        }
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } else {
                System.out.println("Opção inválida!");
                leitura.next();  // Limpa o buffer
            }
        }
        
        leitura.close();  // Fecha o scanner após o uso
    }
}