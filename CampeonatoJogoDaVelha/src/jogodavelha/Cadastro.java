package jogodavelha;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Cadastro{
    
    private int quantidade;
    private String jogador;
    public Scanner sc = new Scanner(System.in);
    List <String> nomeJogador = new ArrayList();
    
    public Cadastro() throws IOException{
        receberQuantidade();
        cadastrarJogador();
        //lerJogador();
    }
    
    public int receberQuantidade(){
        System.out.println("Digite a quantidade de participantes: ");
        quantidade = sc.nextInt();
        return quantidade;
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
        //List <String> nomeJogador = new ArrayList();
        
        //nomeJogador.add(linha);
        while(linha!= null){
            nomeJogador.add(linha);
            for(String nome:nomeJogador){
            System.out.println(nome);
            }
            linha = br.readLine();
        }
        br.close();
    }
    public List<String> obterNome(){
        return nomeJogador;
    }
}
