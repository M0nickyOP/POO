public class Main {
    public static void main(String[] args) {
    int vel = 90;
    int multa = 0;
    if (vel > 80) {
     multa =    5 * (vel - 80);
       System.out.printf("Multado! Pague:%d", multa);
    } else {
      System.out.printf("Sem multa!");
    }
    }
}
    
 
