/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author laris
 */
public class Paciente {

 

    private String nomePaciente;
    private String cpf;
    private String contato;

    public Paciente(String nomePaciente, String cpf, String contato) {
        this.nomePaciente = nomePaciente;
        this.cpf = cpf;
        this.contato = contato;
    }
    
    

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
    
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   
    public String getContato() {
        return contato;
    }

   
    public void setContato(String contato) {
        this.contato = contato;
    }
}
    

    
 

