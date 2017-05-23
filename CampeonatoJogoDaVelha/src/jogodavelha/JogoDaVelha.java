package jogodavelha;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JogoDaVelha {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileWriter fw = new FileWriter("entrada.txt"); //abertura para escreve no arquivo
        PrintWriter pw = new PrintWriter(fw);
        
        Cadastro cadastro = new Cadastro();
        Jogo jogo = new Jogo();
        
    }
    
}
