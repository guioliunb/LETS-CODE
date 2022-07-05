package models;

import java.util.ArrayList;

public class PessoaFisica extends Pessoa{

    public void adicionarConta(Conta conta){
        ArrayList<Conta> contas = this.getContas();
        contas.add(conta);
        this.setContas(contas);
    }
    
}
