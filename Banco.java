
package com.mycompany.mavenproject3;

import java.util.ArrayList;

public class Banco {
    private String nomeDoBanco;
    private ArrayList<Conta> contas;

    // Construtor
    public Banco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
        this.contas = new ArrayList<>();
    }

    // add uma conta ao ArrayList
    public void adicionaConta(Conta c) {
        contas.add(c);
        System.out.println("Conta adicionada: " + c);
    }

    // recuperar uma conta pelo número da conta
    public Conta recuperaConta(int numeroConta) {
        for (Conta c : contas) {
            if (c.getNumeroConta() == numeroConta) {
                return c;
            }
        }
        return null; // Retorna null se não encontrar a conta
    }

    // Getters e Setters
    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
}
    

