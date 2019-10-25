package projetojavarmi;

import java.io.Serializable;

interface IRequisicao extends Serializable{
    void Executa();
}

class Requisicao implements IRequisicao{
    public String mensagem;
    
    
    @Override
    public void Executa() {
       
        
        
    }
}
