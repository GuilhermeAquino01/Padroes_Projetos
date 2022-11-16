package Observer;
import java.util.Observer;
import java.util.Observable;

class CarroPoliceII implements Observer, Carro {
    public void adiante() {
        System.out.println("Viatura I: Carro roubado esta seguindo em frente, viatura continua em linha reta !");
    }

    public void direita() {
        System.out.println("Viatura I: Carro roubado virou a direita, viatura vire a esqueda e a proxima direita para fazer o cerco!");
    }

    public void retornar() {
        System.out.println("Viatura I: Carro roubado retornou, redobre a atenção!");
    }

    public void esquerda() {
        System.out.println("Viatura I: Carro roubado virou a esquerda, viatura vire a direita!");
    }

    public void para() {
        System.out.println("Viatura I: Carro roubado parou, viatura dobre ateção carro roubado parou !");
    }

    //Atualiza o objeto CarroPoliceII quando o CarroRoubado muda direção e manda uma notificação
    public void update(Observable arg0, Object arg1) {
        CarroRoubado carroObservado = (CarroRoubado) arg0;
        String GPS = String.valueOf(arg1);
        carroObservado.hasChanged();

        if (GPS.equals("Adiante")) {
            this.adiante();
        }

        if (GPS.equals("Direita")) {
            this.direita();
        }

        if (GPS.equals("Retornar")) {
            this.retornar();
        }

        if (GPS.equals("Esquerda")) {
            this.esquerda();
        }

        if (GPS.equals("Para")) {
            this.para();
        }


    }
}