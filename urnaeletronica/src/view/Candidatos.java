/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Barbosa's
 */
public class Candidatos {
    
    private String nome;
    private String numero;
    private int votos = 0;
    private char tipo;

    public int getVotos() {
        return votos;
    }

    public void setVotos() {
        this.votos ++;
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

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    

    public Candidatos(String nome, String numero, char tipo) {
        this.nome = nome;
        this.numero = numero;
        this.tipo = tipo;
    }
    
    
    
}
