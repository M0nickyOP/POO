public class Pessoa
{
    String nome;
    int idade;
    double peso;
    double alt;
    
    Pessoa(String nome, int idade, double peso, double alt){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso; 
        this.alt = alt;
    }
    double imc(){
        return this.peso / (this.alt * this.alt);
    }
    String Classificacao(){
        double valorIMC = this.imc();
        if(valorIMC < 18.5)return "abaixo do peso";
        if(valorIMC < 25) return "peso normal";
        if(valorIMC < 30) return "sobrepeso";
        if(valorIMC < 35) return "obesidade grau I";
        if(valorIMC < 40) return "obesidade grau II";
        return "obesidade grau III";
    }
    public String toString(){
        return String.format("o %s tem imc igual a %.2f e sua classificacao e igual a %s", this.nome, this.imc(),this.Classificacao());
    }
}
