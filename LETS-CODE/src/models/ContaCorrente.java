package models;

import java.math.BigDecimal;

public class ContaCorrente extends Conta implements ContaCompleta {

    public ContaCorrente(Pessoa pessoa) {
        this.setCliente(pessoa);
        this.gerarNumeroConta();
    }

    public void sacar(BigDecimal valor) {
        BigDecimal taxa;
        if (this.getCliente().getClass().equals(PessoaJuridica.class)) {
            taxa = BigDecimal.valueOf(0.005);
        } else {
            taxa = BigDecimal.ZERO;
        }
        valor = valor.multiply(taxa.add(BigDecimal.ONE));
        if (this.saldo.compareTo(valor) >= 0) {
            this.saldo = this.saldo.subtract(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
    }

    // Transferência apenas para corrente e poupança (ContaCompleta)
    // Usar investir() para conta investimento
    public void transferir(BigDecimal valor, ContaCompleta contaDestino) {
        BigDecimal taxa;
        if (this.getCliente().getClass().equals(PessoaJuridica.class)) {
            taxa = BigDecimal.valueOf(0.005);
        } else {
            taxa = BigDecimal.ZERO;
        }
        valor = valor.multiply(taxa.add(BigDecimal.ONE));
        if (this.saldo.compareTo(valor) >= 0) {
            this.saldo = this.saldo.subtract(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Transferência apenas para corrente e poupança (ContaCompleta)
    // Usar investir() para conta investimento
    public void investir(BigDecimal valor, ContaInvestimento contaDestino) {
        if (this.saldo.compareTo(valor) >= 0) {
            this.saldo = this.saldo.subtract(valor);
            contaDestino.aplicar(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public String toString(){
        return "Conta Correntes:" + this.getNumeroConta() + "\n-Cliente: " + this.getCliente().getNome();
    }
}
