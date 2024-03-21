/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forma;

import javax.swing.JOptionPane;

/**
 *
 * @author autologon
 */
public class Circuferencia extends Forma{
    private float raio;
    
    
    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
    public Circuferencia(float raio) {
        this.raio = raio;
    }
    @Override
    public void mostra() {
        JOptionPane.showMessageDialog(null, "O raio da circuferencia é: "+getRaio()+"\n Area: "+ area()+"\n Perimetro: "+perimetro());
    }
    @Override
    public float perimetro() {
        float pi = (float) Math.PI;
        return 2*pi*getRaio();
        
    }
    @Override
    public float area() {
        float pi = (float) Math.PI;
        return (float) ((float) pi*(Math.pow(getRaio(), 2)));
    }
    
    
}
