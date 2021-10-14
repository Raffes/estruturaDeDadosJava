package one.digital.innovation.pilha;

public class Main {

    public static void main(String[] args) {
        Pilha lifo = new Pilha();

        // Adicionar nós a pilha
        lifo.push(new No(1));
        lifo.push(new No(2));
        lifo.push(new No(3));
        lifo.push(new No(4));
        lifo.push(new No(5));
        lifo.push(new No(6));

        // Mostra todos os nos
        System.out.println(lifo);

        // fazer o pop | retira o último da pilha
        System.out.println(lifo.pop());

        // mostrando a pilha sem o dado retirado
        System.out.println(lifo);

        // fazer o top | mostra o último da pilha
        System.out.println(lifo.top());

        //System.out.println(filo);

    }
}
