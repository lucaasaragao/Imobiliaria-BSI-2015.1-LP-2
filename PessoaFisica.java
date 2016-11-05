package imobiliaria;


public class PessoaFisica {
   //Atributos
    private String nome;
    private int idade;
    private String cpf;
    private String rg;
    private String nascionalidade;
    private String profissao;
    private String endereco;
    
    // Metodos Publicos
    public void apresentar(){
        System.out.println("-----------------------------------");
        System.out.println("Por favor, comfirme seus dados:");
        System.out.println("Nome; " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("RG: " + this.getRg());
        System.out.println("Pais de Origem: " + this.getNascionalidade());
        System.out.println("Profissão: " + this.getProfissao());
        System.out.println("Endereço Atual; " + this.getEndereco());
        System.out.println("Todos os dados acima estão certos ?");
        
    }
    public void status(){
        System.out.println(this.getNome() + "Bem vindo");
        System.out.println(this.getNome() + "Foi cadastrado com sucesso!");
    }
    public void cadastarImovel(){
     
    }
    public void procurarImovel(){
    
    }
    
    // Metdos especiais

    public PessoaFisica(String no, int id, String cpf, String rg, String nas, 
                        String pro, String end) {
        this.nome = no;
        this.idade = id;
        this.cpf = cpf;
        this.rg = rg;
        this.nascionalidade = nas;
        this.profissao = pro;
        this.endereco = end;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
}


