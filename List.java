public class List<Tipo>{
    private No<Tipo> prim;
    private No<Tipo> ult;
    private int size;

    List(){
        prim = null;
        ult = null;
        size = 1;
    }

    boolean empty(){
        return prim == null;
    }

    int size(){
        return size;
    }

    void pushBack(Tipo valor){
        No<Tipo> novo = new No<>(valor);

        novo.prox = prim;

        if(empty()){
            ult = novo;
        }
        else{
            prim.anter = novo;
        }

        prim = novo;
        size++;
    }

    void pushFront(Tipo valor){
        No<Tipo> novo = new No<>(valor);

        novo.anter = ult;

        if(empty()){
            prim = novo;
        }
        else{
            ult.prox = novo;
        }

        ult = novo;
        size++;
    }

    void show(){
        System.out.print("[");

        if(!empty()){
            No<Tipo> aux = prim;

            System.out.print(aux.valor);
            aux = aux.prox;

            while(aux != null){
                System.out.print(", " + aux.valor);
                aux = aux.prox;
            }
        }

        System.out.println("]");
    }

    Tipo getByIndex(int index){
        No<Tipo> aux = prim;

        while(index-- > 0){
            aux = aux.prox;
        }

        return aux.valor;
    }
}
