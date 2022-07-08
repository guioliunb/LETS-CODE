package models;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(Pessoa pessoa) {
        this.setCliente(pessoa);
        this.gerarNumeroConta();
    }

    // TODO: Checar se dono das duas contas é o mesmo antes de fazer o resgate
    public void resgatar(BigDecimal valor, Conta contaDestino) {

    }

    public void render() {

    }
}
