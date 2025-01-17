package jogo;

import java.util.Random;

public class Jogo {
    private String[] lista_palavras;
    private int tamanhoLista;
    private Random random = new Random();
    private int num_aleatorio;
    private String palavra_aleatoria;
    private String palavraCorreta;
    private int tamanhoPalavraCorreta;
    private StringBuilder palavraOculta;

    public Jogo(String lista_palavras0, String lista_palavras1, String lista_palavras2, String lista_palavras3, String lista_palavras4, String lista_palavras5, String lista_palavras6, String lista_palavras7, String lista_palavras8, String lista_palavras9) {
        setLista_palavras(lista_palavras0, lista_palavras1, lista_palavras2, lista_palavras3, lista_palavras4, lista_palavras5, lista_palavras6, lista_palavras7, lista_palavras8, lista_palavras9);
    }

    public void setLista_palavras(String lista_palavras0, String lista_palavras1, String lista_palavras2, String lista_palavras3, String lista_palavras4, String lista_palavras5, String lista_palavras6, String lista_palavras7, String lista_palavras8, String lista_palavras9) {
        this.lista_palavras = new String[] {lista_palavras0, lista_palavras1, lista_palavras2, lista_palavras3, lista_palavras4, lista_palavras5, lista_palavras6, lista_palavras7, lista_palavras8, lista_palavras9};
        setTamanhoLista(this.lista_palavras);
    }
    public String[] getLista_palavras() {
        return this.lista_palavras;
    }


    public void setNum_aleatorio(int tamanhoLista) {
        if (this.tamanhoLista > 0) {
        this.num_aleatorio = random.nextInt(tamanhoLista);
    } else {
        throw new IllegalArgumentException("A lista de palavras deve conter pelo menos um elemento.");
    }
    }
    public int getNum_aleatorio() {
        return num_aleatorio;
    }


    public void setTamanhoLista(String[] lista) {
        this.tamanhoLista = lista.length;
    }
    public int getTamanhoLista() {
        return this.tamanhoLista;
    }


    public void setPalavra_aleatoria(String[] lista) { // <- aqui
        this.palavra_aleatoria = lista[getNum_aleatorio()];
        setPalavraCorreta(this.palavra_aleatoria);
    }
    public String getPalavra_aleatoria() {
        return palavra_aleatoria;
    }


    public void setPalavraCorreta(String palavraCorreta) {
        this.palavraCorreta = palavraCorreta;
        setTamanhoPalavraCorreta(this.palavraCorreta.length());
        setPalavraOculta(getPalavraCorreta().length());
    }
    public String getPalavraCorreta() {
        return palavraCorreta;
    }


    public void setTamanhoPalavraCorreta(int tamanhoPalavraCorreta) {
        this.tamanhoPalavraCorreta = tamanhoPalavraCorreta;
    }
    public int getTamanhoPalavraCorreta() {
        return tamanhoPalavraCorreta;
    }


    public void setPalavraOculta(int tamanhoPalavraCorreta) {
        this.palavraOculta = new StringBuilder("_".repeat(tamanhoPalavraCorreta));
    }
    public StringBuilder getPalavraOculta() {
        return palavraOculta;
    }
}
