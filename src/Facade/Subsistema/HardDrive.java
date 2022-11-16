package Facade.Subsistema;

public class HardDrive {
    public String read(int startPosition, int size) {
        System.out.println("\n 3: Lê dados do HD...");
        return  "Posição: " + startPosition + ", Tamanho: " + size;
    }
    public void write(int position, String info) {
        System.out.println("\n 6: Escreve dados no HD... Posição:" + position + " Informação: " + info);
    }
}
