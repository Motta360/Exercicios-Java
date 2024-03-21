/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empregado;

/**
 *
 * @author autologon
 */
public class Programador extends Empregado{
    private float qtdeHoras;
    private float valorHora;

    public Programador(float qtdeHoras, float valorHora, String nome, String matricula) {
        super(nome, matricula);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public float getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(float qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public float calculaSalario() {
        return qtdeHoras*valorHora;
    }
    
    
    
    
}
