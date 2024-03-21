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
public class Principal {
    public static void main(String[] args) {
            Circuferencia circu = new Circuferencia(Float.parseFloat(JOptionPane.showInputDialog("Digite o Raio da Circuferencia: ")));
            Retangulo ret = new Retangulo(Float.parseFloat(JOptionPane.showInputDialog("Digite a base do retangulo: ")), Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do retangulo: ")));
            circu.mostra();
            ret.mostra();
          
    }
    
}
