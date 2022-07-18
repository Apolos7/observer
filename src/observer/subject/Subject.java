package observer.subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import observer.observers.Observer;

public class Subject {

    Map<String, ArrayList<Observer>> inscritos = new HashMap<>();

    public Subject() {
    }

    public void inscrever(String produto, Observer inscrito) {
        if(!inscritos.containsKey(produto)){
            ArrayList<Observer> lista = new ArrayList<>();
            lista.add(inscrito);
            inscritos.put(produto, lista);
        }else{
            inscritos.get(produto).add(inscrito);
        } 
    }

    public void desinscrever(String produto, Observer inscrito) {
        inscritos.get(produto).remove(inscrito);
    }

    public void notificar(String produto, String situacao) {
        for (Observer inscrito : inscritos.get(produto)) {
            inscrito.atualizar(produto, situacao);
        }
    }
}
