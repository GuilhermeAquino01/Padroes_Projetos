package TemplateMethod;

public class ProcessadorPagamentoCredito  extends ProcessadorPagamento {

    @Override
    protected void debitar() {
        System.out.println("Processando compra no cartão...");
    }
    // chama o metodo debitar, e o obriga a ser implementado
    @Override
    protected void finalizarAdicional() {
        System.out.println("Compra realizada em 12x!");
    }
    // metodo está sendo implementado da classe processarpagamento.
    // metodo opcional.
    }
