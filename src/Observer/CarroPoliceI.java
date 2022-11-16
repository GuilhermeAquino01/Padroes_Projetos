package Observer;
import java.util.Observer;
import java.util.Observable;
/* observer é uma classe do pacote util do java que pode ser usada mais tem outras formas mais novas para serem usadas.
 */
//classe carro de policia I que implementa a classe carro que é o observe.
public class CarroPoliceI implements Observer, Carro {
    public void adiante() {
        System.out.println("Viatura II: Carro roubado esta seguindo em frente. Fazer cerco!");
    }

    public void direita() {
        System.out.println("Viatura II: Carro roubado virou a direita, viatura virar a direita !");
    }

    public void retornar() {
        System.out.println("Viatura II: Carro roubado está retornando, viatura cuidado ele está na sua frente, atenção!");
    }

    public void esquerda() {
        System.out.println("Viatura II: Carro roubado virou a esquerda, viatura vire a direita!");
    }

    public void para() {
        System.out.println("Viatura II: Carro roubado parou, viatura dobre ateção carro roubado parou !");
    }

    //Atualiza o objeto CarroPoliceI quando o CarroRoubado manda uma notificação!
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
