/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneio;

import javax.swing.JOptionPane;

/**
 *
 * @author autologon
 */
public class Teste {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade: "));
        Torneio participante1 = new Torneio(nome, idade);
        participante1.imprimedados();
    }
    
}
