public class Lista<Tipo>{
    private No<Tipo> prim;
    private No<Tipo> ult;
    private int tamanho;

    Lista(){
        prim = null;
        ult = null;
        tamanho = 1;
    }

    boolean listaVazia(){
        return prim == null;
    }

    int tamanho(){
        return tamanho;
    }

    void add_inicio(Tipo valor){
        No<Tipo> novo = new No<>(valor);

        novo.prox = prim;

        if(listaVazia()){
            ult = novo;
        }
        else{
            prim.anter = novo;
        }

        prim = novo;
        tamanho++;
    }

    void add_final(Tipo valor){
        No<Tipo> novo = new No<>(valor);

        novo.anter = ult;

        if(listaVazia()){
            prim = novo;
        }
        else{
            ult.prox = novo;
        }

        ult = novo;
        tamanho++;
    }

    void imprime(){
        System.out.print("[");

        if(!listaVazia()){
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
}
