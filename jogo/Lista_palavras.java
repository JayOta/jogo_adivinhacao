package jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lista_palavras<T extends Lista_jogo>{ // Classe responsável por guardas tipos diferentes de Listas
    private List<T> listas;
    private int tamanhoLista;
    private Random random = new Random();
    private int num_aleatorio;
    private T lista_aleatoria;
    private String nome;
    
    public Lista_palavras() { // Construtor
        this.listas = new ArrayList<>();
    }

    public void setNome(String nome) { // Método não necessário nesta classe
        this.nome = nome;
    }
    public String getNome() { // Método não necessário nesta classe
        return this.nome;
    }


    public List<T> getListas() { // Não utilizei na Main - Mostra as listas presentes na lista principal em forma de List<T>
        return listas;
    }


    public void addLista(T lista) { // Adiciona uma lista diferente à lista principal das listas
        listas.add(lista);
    }
    public void mostrarListas() { // Não utilizei na Main - Mostra as listas presentes na lista principal em forma de coluna
        for(T lista: listas){
            System.out.println(lista.toString());
        }
    }

    public void setNum_aleatorio() { // Criamos um número aleatório com base no tamanho da lista principal
        this.tamanhoLista = listas.size();
        if (tamanhoLista > 0) {
        this.num_aleatorio = random.nextInt(tamanhoLista);
    } else {
        System.out.println("A lista de palavras deve conter pelo menos um elemento.");
        }
    }
    public int getNum_aleatorio() { // Pegamos o número aleatório
        return this.num_aleatorio;
    }

    public void setLista_aleatoria() { // Criamos uma lista aleatóra
        this.tamanhoLista = listas.size();
        if(tamanhoLista > 0) {
            setNum_aleatorio();
            this.lista_aleatoria = listas.get(getNum_aleatorio());
        } else {
            System.out.println("A lista ainda está vazia!");
        }
    }
    public T getLista_aleatoria() { // Pegamos esta lista aleatória
        return this.lista_aleatoria;
    }
}

