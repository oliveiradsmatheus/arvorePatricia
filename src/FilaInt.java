public class FilaInt {
    NoFilaInt inicio;
    NoFilaInt fim;

    public FilaInt() {
        inicio = fim = null;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void enqueue(int info) {
        if (isEmpty()) {
            inicio = new NoFilaInt(info);
            fim = inicio;
        } else {
            fim.setProx(new NoFilaInt(info));
            fim = fim.getProx();
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int info = inicio.getInfo();
            inicio = inicio.getProx();
            return info;
        }
        return -1;
    }
}
