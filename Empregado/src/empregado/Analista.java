/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empregado;

import java.util.ArrayList;

/**
 *
 * @author autologon
 */
public class Analista extends Empregado{
    private ArrayList<Float> valorPorProjeto ;

    public Analista(ArrayList<Float> valorPorProjeto, String nome, String matricula) {
        super(nome, matricula);
        this.valorPorProjeto = valorPorProjeto;
    }

    public ArrayList<Float> getValorPorProjeto() {
        return valorPorProjeto;
    }

    public void setValorPorProjeto(ArrayList<Float> valorPorProjeto) {
        this.valorPorProjeto = valorPorProjeto;
    }

    @Override
    public float calculaSalario() {
        float salario = 0;
        for (int i = 0; i < valorPorProjeto.size(); i++) {
            salario+= valorPorProjeto.get(i);
            
        }
        return salario;
    }

    
    
    
}
