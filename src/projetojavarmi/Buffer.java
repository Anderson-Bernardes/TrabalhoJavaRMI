package projetojavarmi;

import java.io.Serializable;

interface Buff extends Serializable{
    public void insereBuffer(Requisicao r, int in);
    public Requisicao removeBuffer(int out);
}


public final class Buffer implements Buff{

    private final static int TAMANHO_DO_BUFFER = 3;
    //buffer que armazena as sequisicoes recebidas
    private static final Requisicao req[] = new Requisicao[TAMANHO_DO_BUFFER];
    
    //variavel para instancia uncica do objeto no padrao singleton
    private static Buffer buffer;
    
    //variaveis de controle de criacao e consumo
    public  int autProd = 0;
    public  int termProd = 0;
    public  int autCons = 0;
    public  int termCons = 0;
   
    //variaveis de controle de entrada de dados no buffer
    public int in = 0;
    public int out = 0;

    //construtor privado da classe Buffer
    private Buffer() {
    }

    //metodo para retornar a instancia do objeto Buffer 
    public static Buffer getInstance() {
        if (buffer == null) 
            buffer = new Buffer();

        return buffer;
    }

    //metodo para insercao de dados no buffer
    public void insereBuffer(Requisicao r, int in) {
        System.out.println(r.mensagem);
        System.out.println("in = "+in);
        req[in] = r;
        System.out.println(req[in].mensagem);
    }

    //metodo para remocao de dados do buffer
    public Requisicao removeBuffer(int out) {
        System.out.println("out = "+out);
        System.out.println(req[out]);
        return req[out];
        
    }
    
    public int getTamanho_Buffer(){
     return TAMANHO_DO_BUFFER;   
    }
}
