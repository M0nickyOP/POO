abstract class Funcionario{
    private String nome;
    private String documento; 
    
    public Funcionario(String nome, String documento) throws DadoInvalidoException{
    setNome(nome);
    setDocumento(documento);
    }
    private void setNome(String nome)throws DadoInvalidoException{
    if(nome != null && !nome.isBlank()){
        this.nome = nome;
    }else{
        throw new IllegalArgumentException("Nome Inválido");
    }
}
    private void setDocumento(String documento)
                                throws DadoInvalidoException{
        if(documento != null && !documento.isBlank()){
        this.documento = documento;
    }else{
        throw new IllegalArgumentException("Documento Inválido");
    }
}
    public final String getNome(){
        return this.nome;
    }
    public final String getDocumento(){
        return this.documento;
    }
    public abstract Double calcularSalario();
}
        
    