public class aluno
{
    private double nota;
    public double getNota(){
        return this.nota;
    }
    public void setNota(double nota){
        if (nota<0) {
            nota = 0;
        }
        if(nota>10) {
            nota = 10;
        }
            this.nota = nota; 
    }
}
