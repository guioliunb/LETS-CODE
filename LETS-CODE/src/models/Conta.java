package models;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Conta {

    private String numeroConta;
    private Pessoa cliente;
    BigDecimal saldo = BigDecimal.ZERO;

    //TODO: ENCAPSULAMENTO
    

    /**
     * @return int return the numeroConta
     */
    public String getNumeroConta() {

        return this.numeroConta;
    }

    /**
     * @param string the numeroConta to set
     */
    public void setNumeroConta(String string) {
        this.numeroConta = string;
    }

    /**
     * @return Pessoa return the cliente
     */
    public Pessoa getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }



    //Abrir conta

    public Conta(){

    }

    public BigDecimal consultarSaldo() {
        return saldo;
    }

    public void gerarNumeroConta(){
        Random rand = new Random();
        int maximo = 9999;
        int numeroGerado = rand.nextInt(maximo);
        this.numeroConta = String.valueOf(numeroGerado);

    }




    




}
