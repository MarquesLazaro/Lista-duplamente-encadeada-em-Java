public class No<Tipo>{
    Tipo valor;
    No<Tipo> prox;
    No<Tipo> anter;
    int indice = (anter != null) ? (anter.indice + 1) : 0;

    No(){
        prox = null;
        anter = null;
    }

    No(Tipo valor){
        this.valor = valor;
        prox = null;
        anter = null;
    }
}
