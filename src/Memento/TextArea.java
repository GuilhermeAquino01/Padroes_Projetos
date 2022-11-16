

package Memento;

public class TextArea {

    private String text;

    //instancia o metodo set
    public void set(String text) {
        this.text = text;
    }

    //retorna o texto digitado , utilizando o getText
    public String getText() {
        return text;
    }

    //tira uma "foto" do texto e retorna para o memento
    public Memento takeSnapshot() {
        return new Memento(this.text);
    }

    //restaura o que foi salvo no memento
    //se o memento for diferente de null retorna o que está salvo no getSaveText 
    //se for null , retorna null
    public void restore(Memento memento) {
        this.text = memento != null ? memento.getSavedText() : null;
    }


    //a classe memento possui, dois metodos privados
    //Memento que salva  os textos
    //GetSaveText que retorna os textos salvos
    
    public static class Memento {
        private final String text;

        private Memento(String textToSave) {
            text = textToSave;
        }

        private String getSavedText() {
            return text;
        }
    }

}