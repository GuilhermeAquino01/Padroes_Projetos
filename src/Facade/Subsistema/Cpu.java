package Facade.Subsistema;

public class Cpu {
    public void start() {
        System.out.println("\n 1: Start CPU");
    }
    public void execute() {
        System.out.println("\n 5: Executa algo no processador...");
    }
    public void load() {
        System.out.println("\n 2: Carrega registrador...");
    }
    public void free() {
        System.out.println("\n 8: Libera registradores!");
    }
}
