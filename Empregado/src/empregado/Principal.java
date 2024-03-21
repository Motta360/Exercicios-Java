/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empregado;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author autologon
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Float> valorporprojeto = new ArrayList<Float>();
        int x =1;
        while (x==1) {
            float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de um projeto do analista(Digite -1 para parar): "));
            if(valor < 0){
                x+=1;
            }
            else{
                valorporprojeto.add(valor);
            }
            
        }
        Analista analisador = new Analista(valorporprojeto, JOptionPane.showInputDialog("Digite o nome do analista: "), JOptionPane.showInputDialog("Digite a matricula do analista: "));
        float horas = Float.parseFloat(JOptionPane.showInputDialog("Digite quantas horas o programador trabalhou: "));
        float valorhora = Float.parseFloat(JOptionPane.showInputDialog("Digite quanto o programador faz por hora: "));
        Programador programer = new Programador(horas, valorhora, JOptionPane.showInputDialog("Digite o nome do programador: "), JOptionPane.showInputDialog("Digite a matricula do programador: "));
        
        JOptionPane.showMessageDialog(null, "O analista "+ analisador.getNome()+"\n de matricula: "+analisador.getMatricula()+"\n tem o salario: "+analisador.calculaSalario());
        JOptionPane.showMessageDialog(null, "O programador "+ programer.getNome()+"\n de matricula: "+programer.getMatricula()+"\n tem o salario: "+programer.calculaSalario());
        
    
    }
    
}
