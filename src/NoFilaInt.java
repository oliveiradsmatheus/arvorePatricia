public class NoFilaInt {
    private int info;
    private NoFilaInt prox;

    public NoFilaInt(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NoFilaInt getProx() {
        return prox;
    }

    public void setProx(NoFilaInt prox) {
        this.prox = prox;
    }
}
