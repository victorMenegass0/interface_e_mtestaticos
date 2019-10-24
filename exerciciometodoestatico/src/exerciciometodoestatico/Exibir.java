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
public class Exibir {
    public static void Professor(Professor p) {
        System.out.println(p.getNome());
        System.out.println(p.getDisciplina());
    }
    public static void Coordenador(Coordenador c) {
        System.out.println(c.getNome());
        System.out.println(c.getEscola());
    }
}
