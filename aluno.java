public class aluno
{
    int matricula;
    String nome;
    float nota1;
    float nota2;
    float trabalho;
    
    aluno(int matricula, String nome, float nota1, float nota2, float trabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho = trabalho;
    }
    float media () {
    return (this.nota1 * 2.5f + this.nota2 * 2.5f + this.trabalho * 2f)/7;
    }
    float provaFinal(){
    float m = this.media();
    if (m >=7){
        return 0;
    }
    return 12 - m;
    }
     public String toString(){
        return String.format("o estudante %s tem media %.1f e precisa de %.1f para ser aprovado", this.nome, this.media(), this.provaFinal());
    }
    
}
