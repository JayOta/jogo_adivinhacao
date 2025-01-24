package jogo;

public class Lista_comidas extends Lista_jogo { // Lista sobre comidas (Subclasse)
    private String[] lista;
    private String nome;

    public Lista_comidas(String nome, String[] lista) {
        this.setNome(nome); 
        this.lista = lista; 
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
}
