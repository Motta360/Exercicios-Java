/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package torneio;

import javax.swing.JOptionPane;

/**
 *
 * @author autologon
 */
public class Torneio {
        private String nome;
        private int idade;
  
    public Torneio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String verificaCategoria(){
        if(getIdade()>=5 && getIdade()<=7)
            return "Infantil";        
        if(getIdade()>=8 && getIdade()<=10)
            return "Juvenil";           
        if(getIdade()>=11 && getIdade()<=15)
            return "Adolecente";            
        if(getIdade()>=16 && getIdade()<=30)
            return "Adulto";            
        if(getIdade()>30)
             return "Senior";
        return "Idade Inválida";
         
    }
    
    public void imprimedados(){
        String categoria = verificaCategoria();
        String msg = "Nome: "+getNome()+"\n Idade:"+getIdade()+"\n Categoria:"+ categoria;
        JOptionPane.showMessageDialog(null, msg);
    }

   
    

    /**
     * @param args the command line arguments
     */
    
}
