package models;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(Pessoa pessoa){
        this.setCliente(pessoa);
        this.gerarNumeroConta();
    }

    public void sacar(BigDecimal valor){
        if (this.saldo.compareTo(valor)>=0){
            this.saldo = this.saldo.subtract(valor);
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public void depositar(BigDecimal valor){
        this.saldo = this.saldo.add(valor);
    }

    private void transferirInterna(BigDecimal valor, Conta contaDestino){

        if (this.saldo.compareTo(valor)>=0){
            this.saldo = this.saldo.subtract(valor);
            contaDestino.saldo = contaDestino.saldo.add(valor);
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public void transferir(BigDecimal valor, ContaCorrente contaDestino){
        transferirInterna(valor, contaDestino);
    }

    public void transferir(BigDecimal valor, ContaPoupanca contaDestino){
        transferirInterna(valor, contaDestino);
    }
    public void investir (BigDecimal valor, ContaInvestimento contaDestino){
        if (this.saldo.compareTo(valor)>=0){
            this.saldo = this.saldo.subtract(valor);
            contaDestino.saldo = contaDestino.saldo.add(valor);
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }
    

}
