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
    private StringBuilder palavraOculta; // A classe StringBuilder do Java é usada para criar e manipular strings dinamicamente, ou seja, para modificar variáveis de string

    public Jogo(String[] lista_palavras) {
        setLista_palavras(lista_palavras);
        setNum_aleatorio();
        setPalavra_aleatoria();
    }

    public void setLista_palavras(String[] lista_palavras) {
        this.lista_palavras = lista_palavras;
        setTamanhoLista(this.lista_palavras);
    }
    public String[] getLista_palavras() {
        return this.lista_palavras;
    }


    public void setNum_aleatorio() {
        if (this.tamanhoLista > 0) {
        this.num_aleatorio = random.nextInt(this.tamanhoLista);
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


    public void setPalavra_aleatoria() {
        this.palavra_aleatoria = lista_palavras[getNum_aleatorio()];
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
