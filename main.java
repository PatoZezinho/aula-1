public class Main {
  public Main() {
  }

  public static void main(String[] var0) {
     Pessoa var1 = new Pessoa("Gilson", 68, 1);
     Pessoa var2 = new Pessoa("Sara", 68, 2);
     Pessoa var3 = new Pessoa("Vinicius", 46, 3);
     var1.apresentar(var1.getIdade());
     var2.apresentar(var2.getIdade());
     var3.apresentar(var3.getIdade());

  }
}
