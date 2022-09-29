public class List<Type>{
    private Node<Type> head;
    private Node<Type> tail;
    private int size;

    List(){
        head = null;
        tail = null;
        size = 0;
    }

    boolean isEmpty(){
        return head == null;
    }

    int size(){
        return size;
    }

    void pushBack(Type value){
        Node<Type> newHead = new Node<>(value);

        newHead.next = head;

        if(isEmpty()){
            tail = newHead;
        }
        else{
            head.previous = newHead;
        }

        head = newHead;
        size++;
    }

    void pushFront(Type value){
        Node<Type> newTail = new Node<>(value);

        newTail.previous = tail;

        if(isEmpty()){
            head = newTail;
        }
        else{
            tail.next = newTail;
        }

        tail = newTail;
        size++;
    }

    void removeBack(){
        if(!isEmpty()){
            if(head == tail){
                tail = null;
            }
            else{
                head.next.previous = null;
            }

            head = head.next;
            size--;
        }
    }

    void removeFront(){
        if(!isEmpty()){
            if(tail == head){
                head = null;
            }
            else{
                tail.previous.next = null;
            }

            tail = tail.previous;
            size--;
        }
    }

    void clear(){
        while(!isEmpty()){
            removeBack();
        }
    }


    void showList(){
        System.out.print("[");

        if(!isEmpty()){
            Node<Type> aux = head;

            System.out.print(aux.value);
            aux = aux.next;

            while(aux != null){
                System.out.print(", " + aux.value);
                aux = aux.next;
            }
        }

        System.out.println("]");
    }

    Node<Type> getHead(){
        return head;
    }

    Node<Type> getTail(){
        return tail;
    }

    Node<Type> getByIndex(int index){
        Node<Type> aux = null;

        if(index < size){
            aux = head;
            while(index-- > 0){
                aux = aux.next;
            }
        }
        return aux;
    }
}
