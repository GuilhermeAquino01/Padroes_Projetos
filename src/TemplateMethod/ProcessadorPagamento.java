package TemplateMethod;


//classe abstrata ela não pode ser instanciada apenas herdada
abstract public class ProcessadorPagamento {

    // template method
    public void processarPagamento() {
        preparar();
        validar();
        debitar();
        notificar();
        notificarAdicional();
        finalizar();
        finalizarAdicional();
    }

    // quando for chamar o metodo processar pagamento  é execultado esse codigo abaixo

    // metotodo protegido ou seja ele só visto nas classes são filhas da classe
    //processar pagamento, que são pagamento debíto e pix
    protected abstract void debitar();
    // classe abstrata ela só pode ser herdada, não pode ser instanciadas
    // ele não tem implementação ele obriga ser implementado pelas classes filhas
    private void preparar() {
        System.out.println("Reservando produtos");
    }

    private void validar() {
        System.out.println("Validando cadastro");
    }

    private void notificar() {
        System.out.println("Notificando usuário");
    }

    private void finalizar() {
        System.out.println("Finalizando compra");
    }

    //Hooks - métodos opcionais que podem ser implementados e utilizados pelas classes filhas
    protected void notificarAdicional() {
        // vazio
    }

    protected void finalizarAdicional() {
        // vazio
    }

}