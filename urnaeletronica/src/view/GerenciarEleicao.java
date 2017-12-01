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
public class GerenciarEleicao {

    public static ArrayList<Partido> partidos = new ArrayList();

    public static void adicionarPartido(Partido partido) {
        GerenciarEleicao.partidos.add(partido);
    }

    public static int retornarIndicePartido(String nomePartido) {
        int retorno = -1;
        for (int i = 0; i < GerenciarEleicao.partidos.size(); i++) {
           if(GerenciarEleicao.partidos.get(i).getNome().equalsIgnoreCase(nomePartido)){
               retorno = i;
           }
        }
        return retorno;
    }
    
    public String gerarVencedor() {
        int numeroVencedor = 0;
        String nomeVencedor = "";
        String retorno = "";
        
        for (int i = 0; i < GerenciarEleicao.partidos.size(); i++) {
             for (int j = 0; j < GerenciarEleicao.partidos.get(i).getCandidatos().size(); j++) {    
                if (numeroVencedor < GerenciarEleicao.partidos.get(i).getCandidatos().get(j).getVotos())  {
                    numeroVencedor = GerenciarEleicao.partidos.get(i).getCandidatos().get(j).getVotos();
                    nomeVencedor = GerenciarEleicao.partidos.get(i).getCandidatos().get(j).getNome();
                     
                } else {
                    
                }
                        }
             
             
        retorno = numeroVencedor + ", "+ nomeVencedor;
        
    }return retorno;
    }

}