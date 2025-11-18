public class pessoa{
    private int idade;
    public int getIdade(){
    return this.idade; 
    }
    public void setIdade(int idade){
        if(idade >= 0){
            this.idade = idade; 
        }
    }
}
