package observer.observers;

public class AlertaSmsObserver implements Observer {
    private int numeroTelefone;

    public AlertaSmsObserver(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void atualizar(String produto , String tipoEvento) {
        System.out.println("SMS para: " + numeroTelefone + "\n O produto (" + produto + ") que você queria agora está " + tipoEvento);
    }
}
