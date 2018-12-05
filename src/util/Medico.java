/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author laris
 */
@Entity
@Table(name = "medico", catalog = "hospital", schema = "")
@NamedQueries({
    @NamedQuery(name = "Medico.findAll", query = "SELECT m FROM Medico m")
    , @NamedQuery(name = "Medico.findById", query = "SELECT m FROM Medico m WHERE m.id = :id")
    , @NamedQuery(name = "Medico.findByCrm", query = "SELECT m FROM Medico m WHERE m.crm = :crm")
    , @NamedQuery(name = "Medico.findByNome", query = "SELECT m FROM Medico m WHERE m.nome = :nome")
    , @NamedQuery(name = "Medico.findByEspecialidade", query = "SELECT m FROM Medico m WHERE m.especialidade = :especialidade")})
public class Medico implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "crm")
    private String crm;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "especialidade")
    private String especialidade;

    public Medico() {
    }

    public Medico(Integer id) {
        this.id = id;
    }

    public Medico(Integer id, String crm, String nome, String especialidade) {
        this.id = id;
        this.crm = crm;
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        String oldCrm = this.crm;
        this.crm = crm;
        changeSupport.firePropertyChange("crm", oldCrm, crm);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        String oldEspecialidade = this.especialidade;
        this.especialidade = especialidade;
        changeSupport.firePropertyChange("especialidade", oldEspecialidade, especialidade);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medico)) {
            return false;
        }
        Medico other = (Medico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
