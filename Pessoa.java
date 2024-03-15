
class Pessoa {
    private String nome;
    private int idade;
    private int endereco;
    public Pessoa() {
    }
 
    public Pessoa(String var1, int var2, int var3) {
       this.nome = var1;
       this.idade = var2;
       this.endereco = var3;
    }
 
    public String getNome() {
       return this.nome;
    }
 
    public void setNome(String var1) {
       this.nome = var1;
    }
 
    public int getIdade() {
       return this.idade;
    }
 
    public void setIdade(int var1) {
       this.idade = var1;
    }
    public int getEndereco() {
      return this.endereco;
   }

   public void setEndereco(int var1) {
      this.endereco = var1;
   }
 
    public String getInfoAdicional() {
       return "N/A";
    }
 
    public String toString() {
       String var10000 = this.nome;
       return "Nome: " + var10000 + "\nIdade: " + this.idade + "\nInforma\u00e7\u00e3o Adicional " + this.getInfoAdicional();
    }
 
    public void apresentar() {
       System.out.println("Ol\u00e1, eu sou " + this.nome + "!");
    }
 
    public void apresentar(int var1) {
       System.out.println("Ol\u00e1, eu sou " + this.nome + " tenho " + var1 + " anos!" + " e moro na casa " + this.endereco);
    }
    
 }
 