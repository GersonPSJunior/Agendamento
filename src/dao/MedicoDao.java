package dao;

import conexao.Conexao;
import model.Medico;

public class MedicoDao extends Conexao{
    
    public String cadastrarMedico(Medico medico){
        
        try
        {
            String sentenca;
            sentenca="INSERT INTO MEDICO VALUES (NULL,'"+
                    medico.getCrm()+"','"+ medico.getNome()+
                    "','"+medico.getEspecialidade()+"')";
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
           return e.getMessage();
       
        }
    }
}
