public class No {
    public static final int N = 26;
    private String info;
    private No[] vLig;
    private boolean fim;

    public No() {
        info = "";
        vLig = new No[N];
        fim = false;
    }

    public No(String info, boolean fim) {
        this();
        this.info = info;
        this.fim = fim;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public No getvLig(int pos) {
        return vLig[pos];
    }

    public void setvLig(int pos, No lig) {
        vLig[pos] = lig;
    }

    public boolean isFim() {
        return fim;
    }

    public void setFim(boolean fim) {
        this.fim = fim;
    }
}
