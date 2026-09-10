public class VideoDigital extends ItemDigital{
    private int duracaoMin;
    
    public VideoDigital(String titulo, double tamanhoMB, int duracaoMin){
        super(titulo, tamanhoMB);
        setDuracaoMin(duracaoMin);
    }
    public int getDuracaoMin(){
        return duracaoMin;
    }
    public void setDuracaoMin(int duracaoMin){
        if(duracaoMin <= 1){
            throw new ItemInvalidoException("Duração inválida");
        }
        this.duracaoMin = duracaoMin;
    }
    @Override
    public String getDescricao(){
    return "Video: " + getTitulo() + " - " + duracaoMin + "min (" + getTamanhoMB() + "MB)";
    } 
}