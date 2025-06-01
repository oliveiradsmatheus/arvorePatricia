public class Fila {
    NoFila inicio;
    NoFila fim;

    public Fila() {
        inicio = fim = null;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void enqueue(No no) {
        if (isEmpty()) {
            inicio = new NoFila(no);
            fim = inicio;
        } else {
            fim.setProx(new NoFila(no));
            fim = fim.getProx();
        }
    }

    public No dequeue() {
        if (!isEmpty()) {
            No info = inicio.getInfo();
            inicio = inicio.getProx();
            return info;
        }
        return null;
    }
}
