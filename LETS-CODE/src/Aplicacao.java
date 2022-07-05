import models.Conta;
import models.ContaCorrente;
import models.PessoaFisica;

public class Aplicacao {

    public static void main(String[] args) throws Exception {

        PessoaFisica pessoa = new PessoaFisica();
        pessoa.setNome("erick");
        ContaCorrente conta = new ContaCorrente(pessoa);
        pessoa.adicionarConta(conta);
        
        for (Conta conta3 : pessoa.getContas()) {
            System.out.println(conta3.getCliente().getNome());
        }

        System.out.println("Hello, World!");
    }
}
