/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;

/**
 *
 * @author Barbosa's
 */
public class Partido {
    
    private String nome;
    private String numero;
    private ArrayList<Candidatos> candidatos = new ArrayList();

    public Partido(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Candidatos> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(ArrayList<Candidatos> candidatos) {
        this.candidatos = candidatos;
    }
    
    public void adicionarCandidatos (Candidatos candidato){
        this.candidatos.add(candidato);
    
}
    
}
