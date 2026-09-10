public abstract class Funcionario{
    private String nome;
    private String documento;
    
    public Funcionario(String nome, String documento) throws DadoInvalidoException{
        setNome(nome);
        setDocumento(documento);
    }
    private void setNome(String nome) throws DadoInvalidoException {
        if (nome == null || nome.trim() .isEmpty()){
            throw new DadoInvalidoException("Nome Inválido");
        }
        this.nome = nome;
    }
    private void setDocumento(String documento) throws DadoInvalidoException{
        if(documento == null || nome.trim() .isEmpty()){
            throw new DadoInvalidoException("Documento Inválido");
        }
        this.documento = documento;
    }
    public String getNome(){
        return nome;
    }
    public String getDocumento(){
        return documento;
    }
    public abstract double calcularPagamento();
}
