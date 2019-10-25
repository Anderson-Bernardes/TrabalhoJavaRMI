package projetojavarmi;

import java.rmi.RemoteException;
import java.rmi.registry.Registry;

public class ProjetoJavaRMI {

    public static void main(String[] args) throws RemoteException {
        
       String nome = "ProjetoJavaRMI";
       
       IRemota objetoRemoto = new ClasseRemota();
        Registry registry = java.rmi.registry.LocateRegistry.createRegistry(1101);
       registry.rebind(nome, objetoRemoto);
      
       Runnable servidor = new Runnable() {
           @Override
           public void run() {
               JanelaServidor jn = new JanelaServidor();
                jn.setVisible(true);
           }
           };
       Thread thServidor = new Thread(servidor);
       thServidor.start();
       }
    }
    

