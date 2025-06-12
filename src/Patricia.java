public class Patricia {
    No raiz;

    public Patricia() {
        raiz = null;
    }

    private int buscarIgualdade(String info, String infoNo) {
        int i = 0;
        while (i < info.length() && i < infoNo.length() && info.charAt(i) == infoNo.charAt(i))
            i++;
        return i;
    }

    private boolean noVazio(No no) {
        int pos = 0;
        while (pos < No.N && no.getvLig(pos) == null)
            pos++;
        return pos == No.N;
    }

    public void inserir(String palavra) {
        if (raiz == null) {
            raiz = new No();
            raiz.setvLig(palavra.charAt(0) - 'a', new No(palavra, true));
        } else {
            String subpalavra = palavra;
            No pai = raiz, no = raiz;
            int indice = 0;
            while (indice >= no.getInfo().length() && !subpalavra.isEmpty() && no.getvLig(subpalavra.charAt(0) - 'a') != null) {
                pai = no;
                no = no.getvLig(subpalavra.charAt(0) - 'a');
                indice = buscarIgualdade(subpalavra, no.getInfo());
                subpalavra = subpalavra.substring(indice);
            }
            if (!subpalavra.isEmpty()) {
                if (indice < no.getInfo().length()) {
                    No novo = new No(no.getInfo().substring(0, indice), false);
                    pai.setvLig(novo.getInfo().charAt(0) - 'a', novo);
                    no.setInfo(no.getInfo().substring(indice));
                    novo.setvLig(no.getInfo().charAt(0) - 'a', no);
                    novo.setvLig(subpalavra.charAt(0) - 'a', new No(subpalavra, true));
                } else {
                    if (no.getvLig(subpalavra.charAt(0) - 'a') == null)
                        no.setvLig(subpalavra.charAt(0) - 'a', new No(subpalavra, true));
                    else {
                        indice = buscarIgualdade(subpalavra, no.getInfo());
                        No novo = new No(palavra.substring(indice), true);
                        no.setvLig(palavra.charAt(indice) - 'a', novo);
                    }
                }
            } else {
                if (indice == no.getInfo().length())
                    no.setFim(true);
                else {
                    No novo = new No(no.getInfo().substring(0,indice), true);
                    no.setInfo(no.getInfo().substring(indice));
                    novo.setvLig(no.getInfo().charAt(0) - 'a', no);
                    pai.setvLig(novo.getInfo().charAt(0) - 'a', novo);
                }
            }
        }
    }

    public void exibirPorNivel() {
        Fila fila = new Fila();
        FilaInt filaInt = new FilaInt();
        int nivel = 1;
        fila.enqueue(raiz);
        filaInt.enqueue(nivel);
        boolean ex;

        while (!fila.isEmpty()) {
            No aux = fila.dequeue();
            nivel = filaInt.dequeue();
            ex = false;
            if (!noVazio(aux))
                System.out.print("Nível " + nivel + ": ");
            for (int i = 0; i < No.N; i++) {
                if (aux.getvLig(i) != null) {
                    fila.enqueue(aux.getvLig(i));
                    filaInt.enqueue(nivel + 1);
                    System.out.print(aux.getvLig(i).getInfo() + " ");
                    ex = true;
                }
            }
            if (ex)
                System.out.println();
        }
    }

    public void exibir() {
        emOrdem(raiz, "");
    }

    private void emOrdem(No no, String palavra) {
        if (no != null) {
            palavra += no.getInfo();
            if (!no.getInfo().isEmpty() && no.isFim())
                System.out.println(palavra);
            for (int i = 0; i < No.N; i++) {
                No aux = no.getvLig(i);
                if (aux != null)
                    emOrdem(aux, palavra);
            }
        }
    }
}
