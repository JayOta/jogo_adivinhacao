package jogo;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String perguntaInicial = "";

        while (!perguntaInicial.equals("sim") && !perguntaInicial.equals("nao")){
            System.out.println("Seja bem vindo ao Adivinhador de Palavras!\nO jogo será sobre comidas\nDeseja começar?(sim/nao)");
            perguntaInicial = scanner.nextLine().toLowerCase();
            if(!perguntaInicial.equals("sim") && !perguntaInicial.equals("nao")){
                System.out.println("Resposta inválida! Coloque apenas '(sim|nao)'");
            }
        }
        if(perguntaInicial.equals("sim")){
            Jogo jogo = new Jogo("lasanha", "taco", "churrasco", "omelete", "salada", "bife", "feijoada", "panqueca", "quiche", "risoto");
            jogo.setNum_aleatorio(jogo.getTamanhoLista());
            jogo.setPalavra_aleatoria(jogo.getLista_palavras());
            int tentativas = 0;
            int tentativaMaxima = 10;
            boolean palavraAcertada = false;

            System.out.println("Vamos jogar então!!\n");
            while (tentativas < tentativaMaxima && !palavraAcertada) {
                System.out.println("Palavra oculta: " + jogo.getPalavraOculta());
                String jogador = scanner.nextLine();

                if(jogador.length() == 1){
                    char letraTentada = jogador.charAt(0);
                    boolean acertou = false;
                    
                    for(int i = 0; i < jogo.getPalavraCorreta().length(); i++){
                        if(jogo.getPalavraCorreta().charAt(i) == letraTentada){
                            jogo.getPalavraOculta().setCharAt(i, letraTentada);
                            acertou = true;
                            tentativas--;
                        }
                    } if(!acertou) {
                        System.out.println("Você errou!");
                    }
                    tentativas++; 

                    if(tentativas == tentativaMaxima){
                        System.out.println("Você perdeu!\nA palavra correta era: " + jogo.getPalavraCorreta());
                    } else if(jogo.getPalavraOculta().toString().equals(jogo.getPalavraCorreta())){
                        palavraAcertada = true;
                        acertou = true;
                        System.out.println("Você ganhou!\nPalavra Acertada: " + jogo.getPalavraOculta().toString());
                    }
                } else {
                    System.out.println("Insira apenas uma letra!");
                    tentativas--;
                }
            }
        } else if(perguntaInicial.equals("nao")) {
        System.out.println("Ok, até mais!");
        scanner.close();
    }
    }
}
