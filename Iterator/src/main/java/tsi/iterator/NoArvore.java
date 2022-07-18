package tsi.iterator;

public class NoArvore {
    private NoArvore esquerda;
    private NoArvore direita;
    private NoArvore adjacente;
    private Integer valor;
    
    
    public NoArvore(Integer valor) {
        this.esquerda = null;
        this.direita = null;
        this.valor = valor;
    }
    
    public NoArvore(Integer valor, NoArvore esquerda, NoArvore direita) {
        esquerda.setAdjacente(direita);
        
        this.esquerda = esquerda;
        this.direita = direita;
        this.valor = valor;
    }

    public NoArvore getEsquerda() {
        return esquerda;
    }

    public NoArvore getDireita() {
        return direita;
    }

    public NoArvore getAdjacente() {
        return adjacente;
    }

    public Integer getValor() {
        return valor;
    }
    
    public void setEsquerda(NoArvore esquerda) {
        this.esquerda = esquerda;
    }

    public void setDireita(NoArvore direita) {
        this.direita = direita;
    }

    public void setAdjacente(NoArvore adjacente) {
        this.adjacente = adjacente;
        
        if (this.direita != null) {
            direita.setAdjacente(adjacente.getEsquerda());
        }
    }
    
}
