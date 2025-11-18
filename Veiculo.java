public class Veiculo
{
    private int velocidade; 
    
    public int getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(int velocidade){
        if (velocidade < 0) {
            velocidade = 0;
        }else if (velocidade > 200){
            velocidade = 200;
        }
            this.velocidade = velocidade;
    }
}
