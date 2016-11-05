
package imobiliaria;

import java.awt.Component;
import javax.swing.JOptionPane;


public class Imobiliaria {

    
    public static void main(String[] args) {
        Component cmpnt = null;
        PessoaFisica p[]  = new PessoaFisica [10];
               p[0] = new PessoaFisica(
                JOptionPane.showInputDialog("Digite seu nome"),
                JOptionPane.showConfirmDialog(cmpnt, args),
                JOptionPane.showInputDialog("Digite seu CPF"),
                JOptionPane.showInputDialog("Digite seu RG: "),
                JOptionPane.showInputDialog("Digite sua Nascionalidade"),
                JOptionPane.showInputDialog("Digite sua Profissão: "),
                JOptionPane.showInputDialog("Digite seu endereço") );
        
        
        
        p[0].apresentar();
        p[0].status();
        
    }
    
}
