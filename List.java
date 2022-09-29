public class List<Type>{
    private Node<Type> head;
    private Node<Type> tail;
    private int size;

    List(){
        head = null;
        tail = null;
        size = 1;
    }

    boolean listEmpt(){
        return head == null;
    }

    int size(){
        return size;
    }

    void pushBack(Type valor){
        Node<Type> newHead = new Node<>(valor);

        newHead.next = head;

        if(listEmpt()){
            tail = newHead;
        }
        else{
            head.previous = newHead;
        }

        head = newHead;
        size++;
    }

    void pushFront(Type valor){
        Node<Type> novo = new Node<>(valor);

        novo.previous = tail;

        if(listEmpt()){
            head = novo;
        }
        else{
            tail.next = novo;
        }

        tail = novo;
        size++;
    }

    void show(){
        System.out.print("[");

        if(!listEmpt()){
            Node<Type> aux = head;

            System.out.print(aux.valor);
            aux = aux.next;

            while(aux != null){
                System.out.print(", " + aux.valor);
                aux = aux.next;
            }
        }

        System.out.println("]");
    }

    Type getByIndex(int index){
        Node<Type> aux = head;

        while(index-- > 0){
            aux = aux.next;
        }

        return aux.valor;
    }
}
