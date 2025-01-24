package jogo;

public abstract class Lista_jogo { // Classe Feita para compartilhar os atributos e métodos para as subclasses
    private String[] lista; // Criamos uma lista de String
    private String nome; // Criamos uma nome para esta lista

    public void setNome(String nome) { // Criamos um nome para lista
        this.nome = nome;
    }
    public String getNome() { // Pegamos o nome da lista
        return nome;
    }
    public String[] getLista() { // Pegamos a lista
        return lista;
    }
    
    // public String mostrarLista() { // Não utilizei na Main - Mostramos os itens da lista em forma de coluna
    //     StringBuilder array = new StringBuilder(); // Crio um Array de String Dinâmico
    //     for(String item: lista){
    //         array.append(item).append("\n"); // Eu adiciono um item ao Array de String Dinâmico e quebro a linha
    //     }
    //     return array.toString(); // Retorno o Array de String Dinâmico e transformo-o em String
    // }
    // @Override
    // public String toString() { // Não utilizei na Main - Mostramos sobre o que é e o que tem na lista
    //     return "Lista de : "+ getNome() + " \n" + mostrarLista();
    // }
}
