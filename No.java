public class No<Tipo>{
    Tipo valor;
    No<Tipo> prox;
    No<Tipo> anter;

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
