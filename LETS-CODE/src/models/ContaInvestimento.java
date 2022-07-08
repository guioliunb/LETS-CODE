package models;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(Pessoa pessoa) {
        this.setCliente(pessoa);
        this.gerarNumeroConta();
    }

    public void aplicar(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
        render();
    }

    // TODO: Checar se dono das duas contas é o mesmo antes de fazer o resgate
    public void resgatar(BigDecimal valor, ContaCorrente contaDestino) {

        if (this.saldo.compareTo(valor) >= 0 &&
                this.getCliente().getIdentificador() == contaDestino.getCliente().getIdentificador()) {
            this.saldo = this.saldo.subtract(valor);
            contaDestino.depositar(valor);
            System.out.println("Resgate feito com sucesso! Novo saldo :" + this.saldo);
        } else {
            System.out.println("Não foi possível realizar o resgate");
        }
    }

    public void resgatar(BigDecimal valor, ContaPoupanca contaDestino) {

        if (this.saldo.compareTo(valor) >= 0 &&
                this.getCliente().getIdentificador() == contaDestino.getCliente().getIdentificador()) {
            this.saldo = this.saldo.subtract(valor);
            contaDestino.depositar(valor);
            System.out.println("Resgate feito com sucesso! Novo saldo :" + this.saldo);
        } else {
            System.out.println("Não foi possível realizar o resgate");
        }
    }

    public void render() {
        double taxa = 0.05;
        if (this.getCliente().getClass().equals(PessoaJuridica.class)) {
            taxa += 0.02;
        }
        System.out.println("==========");
        System.out.println("RENDIMENTO");
        System.out.println(this);
        System.out.println("Valor antes do rendimento: " + this.saldo);
        this.saldo = this.saldo.multiply(BigDecimal.valueOf(1 + taxa));
        System.out.println("Valor depois do rendimento: " + this.saldo);
    }

    public String toString() {
        return "Conta Investimento:" + this.getNumeroConta() + "\n-Cliente: " + this.getCliente().getNome();
    }
}
