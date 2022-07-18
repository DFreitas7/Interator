package tsi.iterator;

public class IteratorLargura implements Iterator {
    protected final NoArvore no;
    private final NoArvore ultimo;
    private final NoArvore comecoNivelAnterior;


    public IteratorLargura(NoArvore comecoNivelAnterior, NoArvore no, NoArvore ultimo) {
        this.no = no;
        this.ultimo = ultimo;
        this.comecoNivelAnterior = comecoNivelAnterior;
    }
    
    @Override
    public Iterator obterProximo() {
        if (no.getAdjacente() != null) {
            return new IteratorLargura(comecoNivelAnterior, no.getAdjacente(), ultimo);
        }
        
        if (comecoNivelAnterior.getEsquerda() != null) {
                return new IteratorLargura(comecoNivelAnterior.getEsquerda(), comecoNivelAnterior.getEsquerda(), ultimo);
        }
        
        if (comecoNivelAnterior.getDireita() != null) {
                return new IteratorLargura(comecoNivelAnterior.getDireita(), comecoNivelAnterior.getDireita(), ultimo);
        }
        
        
        return new IteratorLargura(ultimo, ultimo, ultimo);
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
