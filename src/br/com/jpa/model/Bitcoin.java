package br.com.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "local_seq", sequenceName = "local_seq",allocationSize = 1,initialValue = 1)
public class Bitcoin {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "local_seq")
    private Integer id;
    private double valor;
    private int data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    
    
    
}
