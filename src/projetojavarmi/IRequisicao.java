package projetojavarmi;

import java.io.Serializable;
import javax.swing.JOptionPane;

interface IRequisicao extends Serializable{
    void Executa();
}

class Requisicao implements IRequisicao{
    public String mensagem;
    
    
    @Override
    public void Executa() {
        String[] opcoes = {"Fechar"};
        JOptionPane.showOptionDialog(null, mensagem, "Mensagem Recebida!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, null);
        System.out.println("A mensagem recebida é: "+mensagem);
        
    }
}
