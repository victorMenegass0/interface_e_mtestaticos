/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciometodoestatico;

public class Coordenador implements IcontroleSala {
    private String nome;
    private String escola;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
    
    @Override
    public void abrirSala(){
        System.out.println("a sala foi aberta");
    }
}
