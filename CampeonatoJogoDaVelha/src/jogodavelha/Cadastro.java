package jogodavelha;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public final class Cadastro {
    
    private int quantidade;
    private String jogador;
    public Scanner sc = new Scanner(System.in);
    
    public Cadastro() throws IOException{
        receberQuantidade();
        cadastrarJogador();
        lerJogador();
    }
    
    public void receberQuantidade(){
        System.out.println("Digite a quantidade de participantes: ");
        quantidade = sc.nextInt();
    }
    public void cadastrarJogador() throws IOException{
        FileWriter fw = new FileWriter("entrada.txt"); //abertura para escrita do arquivo
        PrintWriter pw = new PrintWriter(fw);
        int i;
        for(i=0;i<quantidade;i++){
            System.out.println("Digite o nome do Participante: ");
            jogador = sc.next();
            pw.println(jogador);
        }
        pw.close();
    }
    
    public void lerJogador() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("entrada.txt"); //leitura do arquivo
        BufferedReader br = new BufferedReader(fr);
        
        String linha = br.readLine();
        
        while(linha!= null){
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();
    }
}
