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





public abstract class Pessoa {

    private String identificador;
    private String nome;

    //private ArrayList<Conta> contas = new ArrayList<Conta>();


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getIdentificador() {
        return identificador;
    }


    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Pessoa (String nome, String identificador){
        this.nome = nome;
        this.identificador = identificador;
    }


}
