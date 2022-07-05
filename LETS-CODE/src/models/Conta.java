package models;

import java.math.BigDecimal;

public abstract class Conta {

    private String numeroConta;
    
    private Pessoa cliente;

    private BigDecimal saldo;

    //TODO: ENCAPSULAMENTO
    

    /**
     * @return int return the numeroConta
     */
    public String getNumeroConta() {
        return numeroConta;
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

    

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    //Abrir conta 

    public Conta(){

    }
    
    public void sacar(BigDecimal valor){

    }
    public void depositar(BigDecimal valor){

    }

    public void transferir(BigDecimal valor, Conta contaDestino){

    }

    /**
     * @return BigDecimal return the saldo
     */
    public BigDecimal consultarSaldo() {
        return saldo;
    }

 
    




}
