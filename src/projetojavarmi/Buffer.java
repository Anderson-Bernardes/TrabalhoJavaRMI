package projetojavarmi;

import java.io.Serializable;

interface Buff extends Serializable{
    public void insereBuffer(Requisicao r, int in);
    public Requisicao removeBuffer(int out);
}


public final class Buffer implements Buff{

    private static final Requisicao req[] = new Requisicao[10];
    private static Buffer buffer;
    
    public  int autProd = 0;
    public  int termProd = 0;
    
    public  int autCons = 0;
    public  int termCons = 0;
   
    public int in = 0;
    public int out = 0;

    private Buffer() {
    }

    public static Buffer getInstance() {
        if (buffer == null) 
            buffer = new Buffer();

        return buffer;
    }

    public void insereBuffer(Requisicao r, int in) {
        System.out.println(r.mensagem);
        System.out.println("in = "+in);
        req[in] = r;
        System.out.println(req[in].mensagem);
    }

    public Requisicao removeBuffer(int out) {
        System.out.println("out = "+out);
        System.out.println(req[out]);
        return req[out];
        
    }
}
