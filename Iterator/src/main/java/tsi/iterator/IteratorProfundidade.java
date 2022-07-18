package tsi.iterator;

public class IteratorProfundidade implements Iterator {
    private final NoArvore no;
    private final NoArvore ultimo;
    private final Iterator anterior;
    boolean iterouEsquerda;
    boolean iterouDireita;


    public IteratorProfundidade(Iterator anterior, NoArvore no, NoArvore ultimo) {
        this.no = no;
        this.ultimo = ultimo;
        this.anterior = anterior;
        this.iterouEsquerda = false;
    }
    
    @Override
    public Iterator obterProximo() {
        if (no.getEsquerda() != null && !iterouEsquerda) {
            iterouEsquerda = true;
            return new IteratorProfundidade(this, no.getEsquerda(), ultimo);
        } if (no.getDireita() != null && !iterouDireita) {
            iterouDireita = true;
            return new IteratorProfundidade(this, no.getDireita(), ultimo);
        }
        
        if (anterior != null) {
            return anterior.obterProximo();
        }
        
        return new IteratorProfundidade(this, ultimo, ultimo);
    }

    @Override
    public boolean temProximo() {
            return  no != ultimo;
    }

    @Override
    public String toString() {
        return no.getValor().toString();
    }
}
