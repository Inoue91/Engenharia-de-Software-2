package jogodavelha;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Humano extends Jogador{
    public Scanner entrada = new Scanner(System.in);
    //private final Cadastro novoCadastro;
    private Jogador j1;
    //public final List<String> nomeJogador;
    
    public Humano(int jogador){
        super(jogador);
        this.jogador = jogador;
        //novoCadastro = new Cadastro();
        //Jogador j1 = new Jogador();
        //nomeJogador = novoCadastro.obterNome();
        //System.out.println("Participante: " + nomeJogador);
        //FileReader fr = new FileReader("entrada.txt"); //leitura do arquivo
        //BufferedReader br = new BufferedReader(fr);
    }
    
    @Override
    public void jogar(Tabuleiro tabuleiro){
        Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, jogador);
    }
    
    @Override
    public void Tentativa(Tabuleiro tabuleiro){
        do{
            do{
                System.out.print("Linha: ");
                tentativa[0] = entrada.nextInt();
                
                if( tentativa[0] > 3 ||tentativa[0] < 1)
                    System.out.println("Linha inválida. É 1, 2 ou 3");
                
            }while( tentativa[0] > 3 ||tentativa[0] < 1);
            
            do{
                System.out.print("Coluna: ");
                tentativa[1] = entrada.nextInt();
                
                if(tentativa[1] > 3 ||tentativa[1] < 1)
                    System.out.println("Coluna inválida. É 1, 2 ou 3");
                
            }while(tentativa[1] > 3 ||tentativa[1] < 1);
            
            tentativa[0]--; 
            tentativa[1]--;
            
            if(!checaTentativa(tentativa, tabuleiro))
                System.out.println("Esse local já foi marcado. Tente outro.");
        }while( !checaTentativa(tentativa, tabuleiro) );
    }
}