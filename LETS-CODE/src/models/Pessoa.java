package models;
/* Projeto do módulo

Crie uma aplicação que simule uma app bancária. Os clientes podem ser pessoa física ou jurídica,
 sendo que para PJ existe a cobrança de uma taxa de 0.5% para cada saque ou transferência. (sobresrita do metodo de cobrança saque ou transferência)
 Além do produto conta-corrente, os clientes PF podem abrir uma conta-poupança e conta-investimento. Clientes PJ não abrem poupança, mas seus rendimentos em conta-investimento rendem 2% a mais.

Crie as funcionalidades: abrir conta, sacar, depositar, transferência, investir e consultar saldo (poupança e corrente).

Use a classe "Aplicacao" para criar seu método "main" e demonstrar o funcionamento do seu código.

Entrega

A entrega deverá ser feita fornecendo o link Github do projeto (link unico para o grupo).

Prazo: 11/08

Avaliação

Serão avaliados os seguintes quesitos:

Completude das funcionalidades Aplicação das regras de negócio Modelagem de domínio
 orientado a objetos Aplicação de encapsulamento Abstração e polimorfismo 

 PESSOA 1 - 1 CONTA (conta > pessoa )
 PESSOA 1 - N CONTA (pessoa > conta)

 
 */


import java.util.ArrayList;


public abstract class Pessoa {

    private String identicador;

    private String nome;

    private ArrayList<Conta> contas = new ArrayList<Conta>();
    //TODO: ENCAPSULAMENTO

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }



    /**
     * @return String return the identicador
     */
    public String getIdenticador() {
        return identicador;
    }

    /**
     * @param identicador the identicador to set
     */
    public void setIdenticador(String identicador) {
        this.identicador = identicador;
    }

    public void adicionarConta(){}



    /**
     * @return ArrayList<Conta> return the contas
     */
    public ArrayList<Conta> getContas() {
        return contas;
    }

    /**
     * @param contas the contas to set
     */
    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

}
