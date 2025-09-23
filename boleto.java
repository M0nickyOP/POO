public class Main {
    public static void main(String[] args) {
     double   valor = 1000.00, juros = 0.5;
     int dias = 10;
     
     double prest = valor + (valor *(juros/100))* dias;
     System.out.printf("O valor do boleto e  %.2f ", prest);
    }
}
