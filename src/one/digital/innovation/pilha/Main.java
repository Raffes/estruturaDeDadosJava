package one.digital.innovation.pilha;

public class Main {

    public static void main(String[] args) {
        Pilha filo = new Pilha();

        // Adicionar nós a pilha
        filo.push(new No(1));
        filo.push(new No(2));
        filo.push(new No(3));
        filo.push(new No(4));
        filo.push(new No(5));
        filo.push(new No(6));

        // Mostra todos os nos
        System.out.println(filo);

        // fazer o pop | retira o último da pilha
        System.out.println(filo.pop());

        // mostrando a pilha sem o dado retirado
        System.out.println(filo);

        // fazer o top | mostra o último da pilha
        System.out.println(filo.top());

        //System.out.println(filo);

    }
}
