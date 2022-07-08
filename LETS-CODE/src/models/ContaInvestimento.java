package models;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(Pessoa pessoa) {
        this.setCliente(pessoa);
        this.gerarNumeroConta();
    }

    // TODO: Aplicar investimento (e talvez já render logo?)
    public void aplicar(BigDecimal valor) {

    }

    // TODO: Checar se dono das duas contas é o mesmo antes de fazer o resgate
    public void resgatar(BigDecimal valor, Conta contaDestino) {

    }

    // TODO: Cliente PJ rende 2% a mais (que alguma outra coisa)
    public void render() {

    }

    // TODO: Fazer toString com os dados da conta investimento
}
