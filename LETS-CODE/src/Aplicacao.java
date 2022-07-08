import models.ContaCorrente;
import models.ContaInvestimento;
import models.ContaPoupanca;
import models.PessoaFisica;
import models.PessoaJuridica;

import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String[] args) throws Exception {
        System.out.println("[LETS-CODE] Projeto do módulo\n");

        PessoaFisica jao = new PessoaFisica("Jao", "12133435456");
        PessoaJuridica corp = new PessoaJuridica("Corporação S/A", "787878");

        ContaCorrente contaJao = new ContaCorrente(jao);
        ContaPoupanca poupancaJao = new ContaPoupanca(jao);
        ContaInvestimento investimentoJao = new ContaInvestimento(jao);
        ContaCorrente contaCorp = new ContaCorrente(corp);
        ContaInvestimento investimentoCorp = new ContaInvestimento(corp);

        contaJao.depositar(BigDecimal.valueOf(550));
        contaJao.sacar(BigDecimal.valueOf(100));

        contaCorp.depositar(BigDecimal.valueOf(550));
        contaCorp.sacar(BigDecimal.valueOf(100));

        // Checar cobrança de taxa
        System.out.println("Saldo Jao: " + contaJao.consultarSaldo());
        System.out.println("Saldo Corp: " + contaCorp.consultarSaldo());

        // TODO: Fazer mais testes
        contaJao.transferir(BigDecimal.valueOf(30), poupancaJao);
        contaJao.investir(BigDecimal.valueOf(120), investimentoJao);
        investimentoCorp.aplicar(BigDecimal.valueOf(100));

        // Teste mesmo titular das contas
        investimentoCorp.resgatar(BigDecimal.valueOf(50), contaCorp);
        
        // Teste valor acima do disponível
        investimentoCorp.resgatar(BigDecimal.valueOf(150), contaCorp);
        
        // Teste titular diferente das contas
        investimentoCorp.resgatar(BigDecimal.valueOf(50), contaJao);
        
        // Teste valor negativo
        investimentoCorp.resgatar(BigDecimal.valueOf(-50), contaJao);

    }
}
