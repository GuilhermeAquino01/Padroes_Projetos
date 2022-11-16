package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        //classe do cliente ele instancia a classe pagamento credito
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamentoCredito();
        processadorPagamento.processarPagamento();

        System.out.println("===============================");
        //classe do cliente ele instancia a classe pagamento debito
        ProcessadorPagamento processadorPagamento2 = new ProcessadorPagamentoDebito();
        processadorPagamento2.processarPagamento();
    }
}
