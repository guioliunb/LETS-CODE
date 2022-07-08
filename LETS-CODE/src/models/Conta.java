package models;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Conta {

    private String numeroConta;
    private Pessoa cliente;
    BigDecimal saldo = BigDecimal.ZERO;

    public String getNumeroConta() {

        return this.numeroConta;
    }

    public void setNumeroConta(String string) {
        this.numeroConta = string;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public BigDecimal consultarSaldo() {
        return saldo;
    }

    public void gerarNumeroConta() {
        Random rand = new Random();
        int maximo = 9999;
        int numeroGerado = rand.nextInt(maximo);
        this.numeroConta = String.valueOf(numeroGerado);
    }

}
