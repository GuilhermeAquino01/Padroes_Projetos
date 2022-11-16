package TemplateMethod;

public class ProcessadorPagamentoPix extends ProcessadorPagamento{
    @Override
    protected void notificarAdicional() {
        System.out.println("Notificações adicionais: Um pix foi agendado para 02/10/2022 no valor de R$259,95");
    }
// sobre-escreve o metodo da classe processar pagameto,
// ele usa o metodo implementanto e o adpata da forma que ele precisa
    @Override
    protected void debitar() {
        System.out.println("Pix efetuado com sucesso para Fulano!");
    }
}
//chamar o metodo debita e o obrigar a ser implementado
