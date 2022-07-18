package observer.controleEstoque;

import java.util.HashMap;
import java.util.Map;

import observer.subject.Subject;

public class Estoque {
    Map<String, String> produtos = new HashMap<>();
    public Subject eventos;

    public Estoque() {
        eventos = new Subject();
    }

    public void adicionarProduto(String produto, String situacao) {
        produtos.put(produto, situacao);
        eventos.notificar(produto, situacao);
    }

    public void atualizarEstoque(String produto, String situacao) {
        produtos.replace(produto, situacao);
        eventos.notificar(produto, situacao);
    }
}