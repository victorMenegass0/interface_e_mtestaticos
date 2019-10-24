/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciometodoestatico;

/**
 *
 * @author Usuário
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coordenador c = new Coordenador();
        c.setNome("JOAO");
        c.setEscola("joao bastisiasf");
        
        Exibir.Coordenador(c);
        
        Professor p = new Professor();
        p.setNome("dasdasd");
        p.setDisciplina("sei la");
        
        Exibir.Professor(p);
       
    }
    
}
