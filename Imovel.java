
package imobiliaria2;
public class Imovel {
    
    // Atributos
    private String nome;
    private String endereco;
    private int quantidade;

    Imovel() {
        this.nome = nome;
        this.endereco = endereco;
        this.quantidade = quantidade;
    }
    
    
    //Metodos
    public void mostrar(){
        System.out.println("O imovel é: " + this.getNome());
        System.out.println("Está localizado no endereço:" + this.getEndereco());
        System.out.println("Estão disponiveis " + this.getQuantidade());
        
    }
            
    
    
    
    
    //Metodos
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
