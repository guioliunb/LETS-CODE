package models;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta implements ContaCompleta {

    // Cliente PJ não abre poupança
    public ContaPoupanca(PessoaFisica pessoa) {
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

    // Transferência apenas para corrente e poupança (ContaCompleta)
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
            contaDestino.aplicar(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // TODO: Fazer toString com os dados da conta poupança
}
