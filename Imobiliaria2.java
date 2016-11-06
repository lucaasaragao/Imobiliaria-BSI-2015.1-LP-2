package imobiliaria2;

import javax.swing.JOptionPane;

public class Imobiliaria2 {

    public static void main(String[] args) {
        Imovel imoveis[] = new Imovel[4];
        
        for(int i = 0; i< imoveis.length; i++){
            imoveis [i] = new Imovel();
            
            String nome = JOptionPane.showInputDialog("Nome do imovel:");
            imoveis[i].setNome(nome);
            String endereco = JOptionPane.showInputDialog("Endereço do imovel:");
            imoveis [i].setEndereco(endereco);
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos imoveis"));
            imoveis[i].setQuantidade(quantidade);
               
        }
        for (Imovel imovei : imoveis) {
            JOptionPane.showInputDialog(null, imovei.getNome() + "\n) endereco" + imovei.getEndereco() + "\n Quantidade: " + imovei.getQuantidade());
        }

    }


}
