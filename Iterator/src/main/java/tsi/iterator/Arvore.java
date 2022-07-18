package tsi.iterator;

public class Arvore {
    private NoArvore raiz;
    private NoArvore ultimo;

    public Arvore(NoArvore raiz) {
        this.raiz = raiz;
        this.ultimo = new NoArvore(0);
    }
    
    public Iterator criarIteratorLargura() {
        return new IteratorLargura(raiz, raiz, ultimo);
    
    }

    public Iterator criarIteratorProfundidade() {
        return new IteratorProfundidade(null, raiz, ultimo);
    }
}
