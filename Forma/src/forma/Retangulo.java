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
public class Retangulo extends Triangulo {
    
    public Retangulo(float base, float altura) {
        super(base, altura);
    }
    
    @Override
    public float area(){
        return this.getBase()*this.getAltura();
    }
    @Override
    public float perimetro(){
        return 2*(this.getAltura()+this.getBase());
    }
    @Override
    public void mostra(){
        JOptionPane.showMessageDialog(null,"A área do retangulo é: "+this.area()+"\n O perimetro é: "+this.perimetro());
    }
}
