public class Lista<Tipo>{
    No<Tipo> prim;
    No<Tipo> ult;
    int tamanho;

    Lista(){
        prim = null;
        ult = null;
        tamanho = 0;
    }

    boolean listaVazia(){
        return prim == null;
    }

    void add_inicio(Tipo valor){
        No<Tipo> novo = new No<>(valor);

        novo.prox = prim;

        if(listaVazia()){
            ult = novo;
        }
        else{
            prim.anter = novo;
            prim = novo;
        }

        prim = novo;
        tamanho++;
    }

    void add_final(Tipo valor){
        No<Tipo> novo = new No<>(valor);

        novo.prox = prim;

        if(listaVazia()){
            ult = novo;
        }
        else{
            prim.anter = novo;
            prim = novo;
        }

        prim = novo;
        tamanho++;
    }
}
