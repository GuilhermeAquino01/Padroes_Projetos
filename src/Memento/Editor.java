package Memento;


import java.util.Deque;
import java.util.LinkedList;

public class Editor {

    private final TextArea textArea;
    private final Deque<TextArea.Memento> stateHistory;

    //o metodo editor é instanciado
    //instancia a área de texto 
    //instancia o historico (stateHistory) como uma lista linkada
    public Editor() {
        textArea = new TextArea();
        stateHistory = new LinkedList<TextArea.Memento>();
    }

    //O metodo write escreverá na área de texto (textArea) com o atributo text , e após escrever 
    // ira tirar uma "foto" da área de texto e salvar no historico(stateHistory) 
    public void write(String text) {
        textArea.set(text);
        stateHistory.offer(textArea.takeSnapshot());
    }
    // utilizando o metodo undo , caso esteja vazio, retornará null
    public void undo() {
        if (stateHistory.isEmpty()) {
            return;
        }
        // caso não esteja vazio, o desfaz(undo) retorna para o anterior salvo no  historico
        stateHistory.pollLast();
        textArea.restore(stateHistory.peekLast());
    }

    //o metodo escreverá na tela o que está salvo no textarea
    public void printText() {
        System.out.println(textArea.getText());
    }

}

