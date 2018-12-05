
package dao;

import model.Agendamento;
import conexao.Conexao;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AgendaDao extends Conexao{
    
    public String cadastrarAgendamento(Agendamento agendamento){
        
        try
        {
            String sentenca;
            sentenca="INSERT INTO AGENDAMENTO VALUES (NULL,'"+
                    agendamento.getMedicos()+"','"+ agendamento.getEspecialidade()+
                    "','"+agendamento.getTipo()+ "','" + agendamento.getData()+"','"
                    +agendamento.getHora()+"','"+agendamento.getPagamento()+"','"+ agendamento.getPaciente()+"')";
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
           return e.getMessage();
       
        }
    }
    public ArrayList listarAgendamento()
    {
        try
        {
            ArrayList agenda=new ArrayList();
            String sentenca="SELECT * FROM `agendamento` ORDER BY `agendamento`.`data` ASC";
            ResultSet rs= this.getResultSet(sentenca);
            while (rs.next())
            {
                
                String medico = rs.getString("MEDICOS");
                String especialidade = rs.getString("ESPECIALIDADE");
                String tipo = rs.getString("TIPO");
                String data = rs.getString("DATA");
                String hora = rs.getString("HORA");
                String pagamento = rs.getString("PAGAMENTO");
                String paciente = rs.getString("PACIENTE");
                Agendamento a = new Agendamento(medico, especialidade, tipo, data, hora, pagamento, paciente);
                agenda.add(a);
            }
            return agenda;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
