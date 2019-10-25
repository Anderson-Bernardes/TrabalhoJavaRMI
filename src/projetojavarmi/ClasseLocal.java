/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetojavarmi;

/**
 *
 * @author ander
 */
public class ClasseLocal {
    public String mensagem;
    
    Requisicao r;
     int n=10;
    Buffer buffer = Buffer.getInstance();
    
    public Requisicao consome(){
         if((buffer.autCons - buffer.termProd) < 0){
            buffer.autCons++;
            
            r = buffer.removeBuffer(buffer.out);
           
            
            buffer.termCons++;
            System.out.println("autCons "+buffer.autCons);
            System.out.println("termCons "+buffer.termCons);
            return r;
        }
        else
            return null;
        
    }
}
