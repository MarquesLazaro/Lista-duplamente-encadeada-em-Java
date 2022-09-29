public class Node<Type>{
    Type value;
    Node<Type> next;
    Node<Type> previous;

    Node(){
        next = null;
        previous = null;
    }

    Node(Type value){
        this.value = value;
        next = null;
        previous = null;
    }
}
