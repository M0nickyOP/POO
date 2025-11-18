public class produto
{    private String nome;
     public String getNome(){
     return this.nome; 
     }
     public void setProduto(String nome){
     if (nome != null && !nome.isBlank()){
         this.nome = nome;
     }else {
         this.nome = nome; 
     }
     }
}
