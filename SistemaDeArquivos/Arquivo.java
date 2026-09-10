public class Arquivo extends NodeSistema{
    private long tamanhoBytes;
    public Arquivo(String nome, long tamanhoBytes) throws DadoInvalidoException{
        super(nome);
        setTamanhoBytes(tamanhoBytes);
    }
    public void setTamanhoBytes(long tamanhoBytes)throws DadoInvalidoException{
        if(tamanhoBytes <= 0){
            throw new DadoInvalidoException("tamanho inválido");
        }
        this.tamanhoBytes = tamanhoBytes;
    }
    
    @Override
    public long getTamanho(){
        return tamanhoBytes;
    }
}