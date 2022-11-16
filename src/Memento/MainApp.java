
package Memento;

public class MainApp {

    public static void main(String[] args) {

    

        Editor editor = new Editor();
        editor.write("Sistema");
        editor.printText();
        editor.write("Sistema Controle");
        editor.printText();
        editor.write("Sistema Controle de Frotas");
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();

    }

}
