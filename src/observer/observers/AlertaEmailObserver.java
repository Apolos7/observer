package observer.observers;

public class AlertaEmailObserver implements Observer {
    private String email;

    public AlertaEmailObserver(String email) {
        this.email = email;
    }

    @Override
    public void atualizar(String produto , String tipoEvento) {
        System.out.println("Email para: " + email + "\n O produto (" + produto + ") que você queria agora está " + tipoEvento);
    }
}
