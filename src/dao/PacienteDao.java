/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Paciente;
import conexao.Conexao;

/**
 *
 * @author laris
 */
public class PacienteDao extends Conexao{
    public String cadastrarPaciente(Paciente paciente){
        
        try
        {
            String sentenca;
            sentenca="INSERT INTO PACIENTE VALUES (NULL,'"+
                    paciente.getNomePaciente()+"','"+ paciente.getCpf()+
                    "','"+paciente.getContato()+"')";
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e)
        {
           return e.getMessage();
       
        }
    }
   
            
}
