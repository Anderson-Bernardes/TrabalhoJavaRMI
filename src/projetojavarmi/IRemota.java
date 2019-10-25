package projetojavarmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public interface IRemota extends Remote {

    boolean requisita(Requisicao r) throws RemoteException;
}

class ClasseRemota extends UnicastRemoteObject implements IRemota {

    ClasseRemota() throws RemoteException {
    }

    int n = 10;

    Requisicao req = new Requisicao();
    Buffer buffer = Buffer.getInstance();

    @Override
    public boolean requisita(Requisicao r) throws RemoteException {
        if ((buffer.autProd - buffer.termCons) < n) {            
            buffer.autProd++;
            
            buffer.insereBuffer(r, buffer.in);
            
            buffer.in = Math.abs(buffer.in+1)%n;
            buffer.termProd++;
            
            //System.out.println("autProd "+autProd);
            //System.out.println("termPro "+req.termProd);
            
            return true;
        }
        return false;
    }
    
   

}
