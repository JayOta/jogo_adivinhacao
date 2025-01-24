package jogo;

public class Lista_bebidas extends Lista_jogo { // Lista sobre bebidas (Subclasse)
    private String[] lista;
    private String nome;

    public Lista_bebidas(String nome, String[] lista) {
        this.lista = lista;
        this.setNome(nome);
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String getNome() {
        return this.nome;
    }
    @Override
    public String[] getLista() {
        return lista;
    }
    
    // @Override
    // public String mostrarLista() {
    //     StringBuilder array = new StringBuilder();
    //     for(String item: lista){
    //         array.append(item).append("\n");
    //     }
    //     return array.toString();
    // }
    // @Override
    // public String toString() {
    //     return "A lista é sobre: " + getNome() + "\n" + mostrarLista();
    // }
}
