package Facade.Subsistema;

public class Memoria {
    public void load(int position, String info) {
        System.out.println("\n 4: Carrega dados na memória " + info);
    }
    public void free(int position, String info) {
        System.out.println("\n 7: Libera dados da memória: " + info);
    }
}
