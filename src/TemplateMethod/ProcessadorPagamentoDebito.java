package TemplateMethod;

public class ProcessadorPagamentoDebito extends ProcessadorPagamento{
    @Override
    protected void notificarAdicional() {
        System.out.println("Débito automático agendado!");
    }

    @Override
    protected void debitar() {
        System.out.println("Debitando valor do saldo em sua conta...");
    }

    @Override
    protected void finalizarAdicional() {
        System.out.println("Valor R$400,00 debitado de sua conta.");
    }
}
