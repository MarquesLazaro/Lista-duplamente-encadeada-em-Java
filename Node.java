public class Node<Type>{
    Type valor;
    Node<Type> next;
    Node<Type> previous;

    Node(){
        next = null;
        previous = null;
    }

    Node(Type valor){
        this.valor = valor;
        next = null;
        previous = null;
    }

    
}
