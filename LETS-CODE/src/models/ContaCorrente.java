package models;

import java.math.BigDecimal;

public class ContaCorrente extends Conta implements ContaCompleta {

    public ContaCorrente(Pessoa pessoa) {
        this.setCliente(pessoa);
        this.gerarNumeroConta();
    }

    public void sacar(BigDecimal valor) {
        if (this.saldo.compareTo(valor) >= 0) {
            this.saldo = this.saldo.subtract(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
    }

    // Transferência apenas para corrente e poupança
    // Usar investir() para conta investimento
    public void transferir(BigDecimal valor, ContaCompleta contaDestino) {
        if (this.saldo.compareTo(valor) >= 0) {
            this.saldo = this.saldo.subtract(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void investir(BigDecimal valor, ContaInvestimento contaDestino) {
        if (this.saldo.compareTo(valor) >= 0) {
            this.saldo = this.saldo.subtract(valor);
            contaDestino.saldo = contaDestino.saldo.add(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
