package models;

import java.math.BigDecimal;

// Interface para os tipos de contas que são capazes de exercer todas as funcionalidades
// ContaCorrente e ContaPoupanca
public interface ContaCompleta {
    public void sacar(BigDecimal valor);

    public void depositar(BigDecimal valor);

    public void transferir(BigDecimal valor, ContaCompleta conta);

    public void investir(BigDecimal valor, ContaInvestimento conta);

    public BigDecimal consultarSaldo();
}
