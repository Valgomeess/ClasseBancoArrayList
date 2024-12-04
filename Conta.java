

package com.mycompany.mavenproject3;


public class Conta {
    private int numeroConta;
    private String titular;
    private double saldo;

    // Construtor
    public Conta(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // para exibir os dados da conta
    @Override
    public String toString() {
        return "Conta Número: " + numeroConta + ", Titular: " + titular + ", Saldo: R$ " + saldo;
    }
}
