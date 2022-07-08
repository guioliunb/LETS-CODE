import models.ContaCorrente;
import models.PessoaFisica;

import java.math.BigDecimal;

public class Aplicacao {

    public static void main(String[] args) throws Exception {

        PessoaFisica jao = new PessoaFisica("Jao", "12133435456");
        ContaCorrente primeiraConta = new ContaCorrente(jao);
        primeiraConta.depositar(BigDecimal.valueOf(250));
        primeiraConta.sacar(BigDecimal.valueOf(100));
        System.out.println("Saldo: " + primeiraConta.consultarSaldo());

        System.out.println("Hello, World!");
    }
}
