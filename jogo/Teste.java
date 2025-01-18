package jogo;

public class Teste { // Classe feita para testar as funcionalidades das sub listas, entre outras coisas..
    public static void main(String[] args) {
        Lista_palavras<Lista_jogo> lista_palavras = new Lista_palavras<>();
        lista_palavras.addLista(new Lista_comidas("comidas",new String[]{"lasanha", "taco", "churrasco", "omelete", "salada", "bife", "feijoada", "panqueca", "quiche", "risoto"}));
        lista_palavras.addLista(new Lista_esportes("esportes", new String[]{"futebol", "Basquete", "volei", "tenis", "natacao", "ciclismo", "atletismo", "ginastica", "boxe", "esgrima"}));
        lista_palavras.addLista(new Lista_bebidas("bebidas", new String[]{"suco de laranja", "cafe", "cha", "guarana", "agua", "cerveja", "vinho", "milkshake"}));
        lista_palavras.setLista_aleatoria();
        
    }
}
