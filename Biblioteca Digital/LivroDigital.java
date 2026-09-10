public class LivroDigital extends ItemDigital{
    private String autor;
    
    public LivroDigital(String titulo, double tamanhoMB, String autor){
        super(titulo, tamanhoMB);
        setAutor(autor);
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        if(autor == null || autor.trim().isEmpty()){
            throw new ItemInvalidoException("Autor Inválido");
        }
        this.autor = autor;
    }
    @Override 
    public String getDescricao(){
        return "Livro: " + getTitulo() + " - " + autor + " ("+ getTamanhoMB() + "MB)";
    }
}