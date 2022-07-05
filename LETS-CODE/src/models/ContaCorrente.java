package models;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(Pessoa pessoa){
        this.setCliente(pessoa);
        this.setSaldo(BigDecimal.valueOf(0));
        this.setNumeroConta("237632784327");
    }
    

}
