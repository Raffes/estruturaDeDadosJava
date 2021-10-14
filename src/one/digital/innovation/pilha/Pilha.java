package one.digital.innovation.pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop() {
        if(!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {

        String retorno = "-------------------\n";
        retorno += "       Pilha\n";
        retorno += "-------------------\n";

        No noAux = refNoEntradaPilha;

        while (true) {
            if(noAux != null) {
                retorno += "[ No{ dado = " + noAux.getDado() + " } ]\n";
                noAux = noAux.getRefNo();
            }else {
                break;
            }
        }
        retorno += "--------end-------\n";
        return retorno;

    }
}
