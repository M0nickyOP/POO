public class Estoque
{
  String nome;
  int qtdAtual;
  int qtdMinima;
  
  public Estoque(String nome, int qtdAtual,int qtdMinima) {
      this.nome = nome;
      this.qtdAtual = qtdAtual;
      this.qtdMinima = qtdMinima;
  }

  void repor (int qtd){
      if (qtd > 0)
      this.qtdAtual += qtd;
  }
  void darBaixa(int qtd){
      if (qtdAtual >= qtd) {
      this.qtdAtual -= qtd;
    }
  }
  String descricao(){
      return "Produto "+ this.nome + "/ Quantidade:" + this.qtdAtual + "/ Quantidade minima:" + this.qtdMinima;
  }
  
  Boolean precisaRepor(){
     return qtdAtual <= qtdMinima;
      }
      

   
}

  

