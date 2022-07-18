package observer;

import observer.controleEstoque.Estoque;
import observer.observers.AlertaEmailObserver;
import observer.observers.AlertaSmsObserver;

public class Program {
    public static void main(String[] args) {
        Estoque estoqueLoja = new Estoque();
        
        estoqueLoja.eventos.inscrever("TV 50\" UHD Samsung 4k 50AU7700",new AlertaSmsObserver(99887766));
        
        estoqueLoja.eventos.inscrever("Celular Samsung Galaxy S21 Ultra", new AlertaEmailObserver("kgb@example.com"));

        estoqueLoja.adicionarProduto("TV 50\" UHD Samsung 4k 50AU7700", "Em estoque"); 

        estoqueLoja.eventos.inscrever("Celular Samsung Galaxy S21 Ultra", new AlertaEmailObserver("aless@example.com"));

        estoqueLoja.adicionarProduto("Celular Samsung Galaxy S21 Ultra", "Fora de Estoque"); 

        estoqueLoja.atualizarEstoque("Celular Samsung Galaxy S21 Ultra", "Em Estoque");
    }
}