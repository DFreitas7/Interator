package tsi.iterator;

import java.util.TreeSet;
import java.util.Arrays;


public class App {

    public static void main(String[] args) {
        NoArvore raiz = new NoArvore(1, new NoArvore(2, new NoArvore(4), new NoArvore(5)), new NoArvore(3, new NoArvore(6), new NoArvore(7)));
        Arvore arvore = new Arvore(raiz);
        
        System.out.println("Iteração em largura");
        for (Iterator it = arvore.criarIteratorLargura(); it.temProximo(); it = it.obterProximo()) {
            System.out.println(it);
        }
       
        System.out.println("Iteração em profundidade");
        for (Iterator it = arvore.criarIteratorProfundidade(); it.temProximo(); it = it.obterProximo()) {
            System.out.println(it);
        }
        
    }
}
