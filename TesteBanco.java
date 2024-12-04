
package com.mycompany.mavenproject3;


public class TesteBanco {
    public static void main(String[] args) {
        //  instância do Banco
        Banco meuBanco = new Banco("Banco do Brasil");

        //  contas criadas
        Conta conta1 = new Conta(1001, "Lisandra Gomes", 1500.00);
        Conta conta2 = new Conta(1002, "Anderson Pereira", 2500.50);
        Conta conta3 = new Conta(1003, "Graziela Souza", 3200.75);

        //  Adicionar as contas ao banco
        meuBanco.adicionaConta(conta1);
        meuBanco.adicionaConta(conta2);
        meuBanco.adicionaConta(conta3);

        // Recuperar uma conta pelo número da conta
        int numeroProcurado = 1002;
        Conta contaRecuperada = meuBanco.recuperaConta(numeroProcurado);

        if (contaRecuperada != null) {
            System.out.println("\nConta recuperada:");
            System.out.println(contaRecuperada);
        } else {
            System.out.println("\nConta número " + numeroProcurado + " não encontrada.");
        }

        //  Exibir todas as contas do banco 
        System.out.println("\nTodas as contas do " + meuBanco.getNomeDoBanco() + ":");
        for (Conta c : meuBanco.getContas()) {
            System.out.println(c);
        }
    }
}
