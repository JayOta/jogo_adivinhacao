package jogo;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) { // Método Principal
        Scanner scanner = new Scanner(System.in); // Crio um escaneador de entradas
        
        String perguntaInicial = ""; // Inicializo a pergunta inicial
        Lista_palavras<Lista_jogo> lista_palavras = new Lista_palavras<>(); // Crio um Array principal para colocar as listas de tipos diferentes
        lista_palavras.addLista(new Lista_comidas("comidas",new String[]{"lasanha", "taco", "churrasco", "omelete", "salada", "bife", "feijoada", "panqueca", "quiche", "risoto"})); // Coloco o nome e crio uma lista de Comidas
        lista_palavras.addLista(new Lista_esportes("esportes", new String[]{"futebol", "Basquete", "volei", "tenis", "natacao", "ciclismo", "atletismo", "ginastica", "boxe", "esgrima"})); // Coloco o nome e erio uma lista de Esportes
        lista_palavras.addLista(new Lista_bebidas("bebidas", new String[]{"suco de laranja", "cafe", "cha", "guarana", "agua", "cerveja", "vinho", "milkshake"})); // Coloco o nome e crio uma lista de Bebidas
        lista_palavras.setLista_aleatoria(); // Pego uma lista aleatória entre estas três últimas listas criadas

        while (!perguntaInicial.equals("sim") && !perguntaInicial.equals("nao")){ // Verifica se o jogador escreveu algo diferente de (sim|nao) e caso isto aconteça ->
            System.out.println("Seja bem vindo ao Adivinhador de Palavras!\nO jogo será sobre " + ((Lista_jogo) lista_palavras.getLista_aleatoria()).getNome() + "\nDeseja começar?(sim/nao)"); // Dou boas vindas e digo sobre qual "tipo"(tipo da lista) será o jogo
            perguntaInicial = scanner.nextLine().toLowerCase(); // Pego a pergunta inicial e transformo-a em letra minúscula
            if(!perguntaInicial.equals("sim") && !perguntaInicial.equals("nao")){ // Se a pergunta inicial for difente de (sim|nao) ->
                System.out.println("Resposta inválida! Coloque apenas '(sim|nao)'"); // Digo que a resposta é inválida e reinicio o jogo perguntando novamente ao jogador se ele deseja jogar
            }
        }
        if(perguntaInicial.equals("sim")){ // Se a pergunta inicial for igual a "sim"
            Jogo jogo = new Jogo(lista_palavras.getLista_aleatoria().getLista()); // Crio uma lista de palavras aleatória que está relacionada às três sub listas iniciais
            int tentativas = 0; // Controla o número de tentativas que o jogador faz
            int tentativaMaxima = 10; // Controle e diz o número máximo de tentativas que o jogador pode fazer
            boolean palavraAcertada = false; // Verifica se o jogador ganhou ou acertou a palavra do jogo

            System.out.println("Vamos jogar então!!\n");
            while (tentativas < tentativaMaxima && !palavraAcertada) { // Loop que continua a execução do jogo caso o número de tentavias do jogador seja menor que o número máximo e caso a palavra não seja acertada
                System.out.println("Palavra oculta: " + jogo.getPalavraOculta()); // Mostro a "Palavra Oculta"(palavra que o jogador tem que acertar) 
                String jogador = scanner.nextLine(); // Escaneia o que o jogador colocou

                if(jogador.length() == 1){ // Se o jogador colocar apenas uma coisa/letra
                    char letraTentada = jogador.charAt(0); // Pega a primeira letra que o jogador colocou
                    boolean acertou = false; // Verifica se o jogador acertou a letra
                    
                    for(int i = 0; i < jogo.getPalavraCorreta().length(); i++){ // Olho a palavra correta(palavra que o jogador deve acertar)
                        if(jogo.getPalavraCorreta().charAt(i) == letraTentada){ // Se a palavra que o loop está verificando, for igual a letra que o jogador tentou ->
                            jogo.getPalavraOculta().setCharAt(i, letraTentada); // Altero a letra oculta para a letra correta que deve aparecer
                            acertou = true; // Digo que o jogador acertou a letra
                            tentativas--; // Aumento uma tentativa pois caso ele não acerte o número de tentativas diminui - Assim deixando as tentativas do jogador como já estão
                        }
                    } if(!acertou) { // Se o jogador errou a letra
                        System.out.println("Você errou!"); // Digo que o jogador errou
                    }
                    tentativas++; // Diminuo o número de tentativas restantes

                    if(tentativas == tentativaMaxima){ // Se o jogador fizer o máximo de tentativas e não ganhar o jogo ->
                        System.out.println("Você perdeu!\nA palavra correta era: " + jogo.getPalavraCorreta()); // Digo que o jogador perdeu e mostro qual era a palavra correta
                    } else if(jogo.getPalavraOculta().toString().equals(jogo.getPalavraCorreta())){ // Se a palavra oculta for totalmente acertada/for igual a palavra correta ->
                        acertou = true; // Digo que o jogador acertou a letra correta
                        palavraAcertada = true; // Digo que o jogador a palavra correta
                        System.out.println("Você ganhou!\nPalavra Acertada: " + jogo.getPalavraOculta().toString()); // Digo que o jogador ganhou e mostro a palavra que ele acertou
                    }
                } else { // Se o jogador colocar mais de uma letra quando estiver tentando acertar a letra correta ->
                    System.out.println("Insira apenas uma letra!"); // Digo que ele deve inserir apenas uma letra
                    tentativas--; // (Aumento/Deixo igual) o número de tentativas restantes 
                }
            }
        } else if(perguntaInicial.equals("nao")) { // Se a resposta da pergunta inicial for igual a "nao" ->
        System.out.println("Ok, até mais!"); // Me despeço do jogador
        scanner.close(); // Fecho o escaneador de entradas
    }
    }
}
