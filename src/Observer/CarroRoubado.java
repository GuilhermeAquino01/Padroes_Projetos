package Observer;
import java.util.Observable;

//classe que está sendo observada e implementa a inteface carro
public class CarroRoubado extends Observable implements Carro {

    //variavel onde armazena a posição do carro roubado
    private String GPS = "";


    public void adiante() {
        GPS = "Adiante";
        System.out.println("Infrator: Carro continua em linha reta !");
        this.mudaEstado();
    }

    public void direita() {
        GPS = "Direita";
        System.out.println("Infrator: Carro roubado virou a direita !");
        this.mudaEstado();
    }

    public void retornar() {
        GPS = "Retornar";
        System.out.println("Infrator: Carro roubado retornou!");
        this.mudaEstado();
    }

    public void esquerda() {
        GPS = "Esquerda";
        System.out.println("Infrator: Carro roubado virou a esquerda!");
        this.mudaEstado();
    }

    public void para() {
        GPS = "Para";
        System.out.println("Infrator: Carro roubado parou!");
        this.mudaEstado();
    }

    //metodo que que acompanha o estado do carro roubado
    public void mudaEstado(){
        setChanged(); // Mudou o estado do objeto CarroRoubado!
        notifyObservers(GPS); // Notifica os Observadores que teve uma mudança no estado do objeto observado!
    }
}