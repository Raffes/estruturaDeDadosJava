package one.digital.innovation.fila;

public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    // Adiciona novo nó a fila
    public void enqueue(No novoNo) {
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    // verifica se a fila está vazia
    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    // Me retorna o primeiro da fila
    public No first() {
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    // Retirna o primeiro nó a fila
    public No dequeue() {
        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAux = refNoEntradaFila;

            while (true) {
                if (primeiroNo.getRefNo() != null){
                    noAux = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else {
                    noAux.setRefNo(null);
                    break;
                }
            }

            return primeiroNo;
        }
        return null;
    }

    // Trazer os dados
    @Override
    public String toString() {

        String retorno = "-------------------\n";
        retorno += "       Fila\n";
        retorno += "-------------------\n\n";

        No noAux = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (true) {
                retorno += "[ No{ dado = " + noAux.getObj() + " } ] ---> \t";

                if (noAux.getRefNo() != null){
                    noAux = noAux.getRefNo();

                }else {
                    retorno += "NULL\n";
                    break;
                }
            }
        }else {
            retorno = "NULL\n";
        }


        retorno += "\n--------end-------\n";
        return retorno;

    }
}
