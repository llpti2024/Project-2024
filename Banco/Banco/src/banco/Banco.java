package banco;

import modelos.Conta;
import modelos.Pessoa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public abstract class Banco {
    private static final Scanner input = new Scanner(System.in);
    private static final Map<Integer, Pessoa> pessoasMap = new HashMap<>();
    private static final Map<Integer, Conta> contasMap = new HashMap<>();
    private static int contaAtual = 1;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n");
            System.out.println("|||||||||||||||||");
            System.out.println("|MENU PRINCIPAL:|");
            System.out.println("|||||||||||||||||");
            System.out.println("");
            System.out.println("1. Novo cliente");
            System.out.println("2. Administrar conta");
            System.out.println("0. Sair do sistema");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1 : cadastro();
                case 2 : exibirMenu();
                case 0 : {
                    System.out.println("Saindo do sistema.");
                    return;
                }
                default : System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void cadastro() {
        System.out.println("\n");
        System.out.println("|||||||||||||||||||||||||||||||||||");
        System.out.println("|Bem-vindo ao sistema de cadastro!|");
        System.out.println("|||||||||||||||||||||||||||||||||||");
        System.out.println("");
        System.out.println("||||||||||||||||||||||||||");
        System.out.println("|Digite seu nome completo|");
        System.out.println("||||||||||||||||||||||||||");
        String nome = input.nextLine();
        System.out.println("");
        System.out.println("||||||||||||||||");
        System.out.println("|Digite seu CPF|");
        System.out.println("||||||||||||||||");
        long cpf = input.nextLong();
        input.nextLine();

        Pessoa pessoa = new Pessoa(nome, cpf);
        pessoasMap.put(contaAtual, pessoa);
        Conta conta = new Conta(String.valueOf(contaAtual));
        contasMap.put(contaAtual, conta);
        System.out.println("");
        System.out.println("||||||||||||||||||||||||||||||||||");
        System.out.println("|Cadastro concluído com sucesso! |");
        System.out.println("|O número da sua conta é: " + contaAtual+"      |");
        System.out.println("||||||||||||||||||||||||||||||||||");
        contaAtual++;
    }

    public static void exibirMenu() {
        System.out.println("\n");
        System.out.println("||||||||||||||||||||||||||||||");
        System.out.println("|Digite o número da sua conta|");
        System.out.println("||||||||||||||||||||||||||||||");
        int idConta = input.nextInt();
        input.nextLine();

        if (!pessoasMap.containsKey(idConta)) {
            System.out.println("Você não está cadastrado.");
            System.out.print("Gostaria de se cadastrar? (S/N): ");
            String resposta = input.nextLine().trim().toUpperCase();

            if (resposta.equals("S") || resposta.equals("SIM")) {
                cadastro();
            } else {
                System.out.println("Saindo do sistema...");
                return;
            }
        } else {
            while (true) {
                System.out.println("\n");
                System.out.println("|||||||||||||||");
                System.out.println("|MENU DO BANCO|");
                System.out.println("|||||||||||||||");
                System.out.println("");
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Saldo");
                System.out.println("0. Sair");
                System.out.println("");
                System.out.print("Escolha uma opção: ");
                int opcao = input.nextInt();
                input.nextLine();

                switch (opcao) {
                    case 1 : depositar(idConta);
                    case 2 : sacar(idConta);
                    case 3 : exibirSaldo(idConta);
                    case 0 : {
                        System.out.println("Saindo do menu do banco...");
                        return;
                    }
                    default : System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }

    public static void depositar(int idConta) {
        Conta conta = contasMap.get(idConta);
        System.out.println("||||||||||||||||||||||||||||");
        System.out.println("|Digite o valor a depositar|");
        System.out.println("||||||||||||||||||||||||||||");
        System.out.print("R$ ");
        double valor = input.nextDouble();
        input.nextLine();
        conta.depositar(valor);
    }

    public static void sacar(int idConta) {
        Conta conta = contasMap.get(idConta);
        System.out.println("||||||||||||||||||||||||");
        System.out.println("|Digite o valor a sacar|");
        System.out.println("||||||||||||||||||||||||");
        System.out.print("R$ ");
        double valor = input.nextDouble();
        input.nextLine();
        conta.sacar(valor);
    }

    public static void exibirSaldo(int idConta) {
        Conta conta = contasMap.get(idConta);
        System.out.println("||||||||||||||||||||||||");
        System.out.println("    Saldo atual: " + conta);
        System.out.println("||||||||||||||||||||||||");
    }
}





