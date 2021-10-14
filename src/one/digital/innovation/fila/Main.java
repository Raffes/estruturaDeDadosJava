package one.digital.innovation.fila;

public class Main {
    public static void main(String[] args) {

        Fila fifo = new Fila();

        fifo.enqueue(new No("Primeiro"));
        fifo.enqueue(new No("Segundo"));
        fifo.enqueue(new No("Terceiro"));
        fifo.enqueue(new No("Quarto"));
        fifo.enqueue(new No("Quinto"));

        System.out.println(fifo);

        // Pegar e retira o primeiro da fila
        System.out.println(fifo.dequeue());

        // Pega o nós com o nó retirado
        System.out.println(fifo);

        // Adiciona no final da fila
        fifo.enqueue(new No("Ultimo"));

        // Pega o primeiro nó da fila
        System.out.println(fifo.first());

        // mostra todos os nós
        System.out.println(fifo);

    }
}
