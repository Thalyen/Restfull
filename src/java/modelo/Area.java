/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author Tat
 */
public class Area {
    
    private int id;
    private String nome;
    private List<Subarea> subareas;

    public List<Subarea> getSubareas() {
        return subareas;
    }

    public void setSubareas(List<Subarea> subareas) {
        this.subareas = subareas;
    }

    public Area(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}