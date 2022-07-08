package models;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(Pessoa pessoa) {
        this.setCliente(pessoa);
        this.gerarNumeroConta();
    }

    // TODO: Aplicar investimento (e talvez já render logo?)
    public void aplicar(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
        render();
    }

    // TODO: Checar se dono das duas contas é o mesmo antes de fazer o resgate
    public void resgatar(BigDecimal valor, Conta contaDestino) {

    }

    // TODO: Cliente PJ rende 2% a mais (que alguma outra coisa)
    public void render() {
        System.out.println("==========");
        System.out.println("RENDIMENTO");
        System.out.println(this);
        System.out.println("Valor antes do rendimento: " + this.saldo);
        this.saldo = this.saldo.multiply(BigDecimal.valueOf(1.02));
        System.out.println("Valor depois do rendimento: " + this.saldo);
    }

    public String toString(){
        return "Conta Investimento:" + this.getNumeroConta() + "\n-Cliente: " + this.getCliente().getNome();
    }
}
