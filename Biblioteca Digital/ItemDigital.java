public abstract class ItemDigital{
    private String titulo;
    private double tamanhoMB;
    
    public ItemDigital(String titulo, double tamanhoMB){
        setTitulo(titulo);
        setTamanhoMB(tamanhoMB);
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo)  {
        if(titulo == null || titulo.trim().isEmpty()){
            throw new ItemInvalidoException("Titulo Inválido:");
        }
        this.titulo = titulo.trim();
    }
    public double getTamanhoMB(){
        return tamanhoMB;
    }
    public void setTamanhoMB(double tamanhoMB)  {
        if(tamanhoMB <= 0){
            throw new ItemInvalidoException("O tamanho deve ser maior que 1!");
        }
        this.tamanhoMB = tamanhoMB;
    }
    public abstract String getDescricao();
}