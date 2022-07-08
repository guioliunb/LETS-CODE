package models;

public class PessoaFisica extends Pessoa {
    public PessoaFisica(String nome, String cpf) {
        super(nome, cpf);
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\nCPF: " + this.getIdentificador();
    }
}
