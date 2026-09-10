public class AudioDigital extends ItemDigital{
    private int qualidadeKbps;
    
    public AudioDigital(String titulo, double tamanhoMB, int qualidadeKbps){
        super(titulo, tamanhoMB);
        setQualidadeKbps(qualidadeKbps);
    }
    public int getQualidadeKbps(){
        return qualidadeKbps;
    }
    public void setQualidadeKbps(int qualidadeKbps){
        if(qualidadeKbps <= 64){
            throw new ItemInvalidoException("Qualidade Inválida!");
        }
        this.qualidadeKbps = qualidadeKbps;
    }
    @Override 
    public String getDescricao(){
        return "Áudio: " + getTitulo() + " - " + qualidadeKbps + "Kbps (" + getTamanhoMB() + "MB)";
    }
}