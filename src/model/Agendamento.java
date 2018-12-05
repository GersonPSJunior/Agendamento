
package model;


public class Agendamento {
    private String medicos;
    private String especialidade;
    private String tipo;
    private String data;
    private String hora;
    private String pagamento;
    private String paciente;

    public Agendamento(String medicos,String especialidade, String tipo, String data, String hora, String pagamento, String paciente) {
        this.medicos = medicos;
        this.especialidade = especialidade;
        this.tipo = tipo;
        this.data = data;
        this.hora = hora;
        this.pagamento = pagamento;
        this.paciente = paciente;
    }
    
    public String getMedicos() {
        return medicos;
    }

    public void setMedicos(String medicos) {
        this.medicos = medicos;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    
} 