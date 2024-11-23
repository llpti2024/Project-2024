package modelos;

public class Conta {
    private double saldo;
    private final String conta;

    public Conta(String conta) {
        this.saldo = 0D;
        this.conta = conta;
    }

    public void depositar(double deposito) {
        saldo += deposito;
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Depósito realizado com sucesso. Saldo atual: R$ " + saldo);
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("*********************");
            System.out.println("Saldo insuficiente!");
            System.out.println("*********************");
        } else {
            saldo -= valor;
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("Saque realizado com sucesso. Saldo atual: R$ " + saldo);
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
    }

    @Override
    public String toString() {
        return "R$ " + saldo;
    }
}