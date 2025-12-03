public class Multadd {

    public static void main(String[] args) {
        
       
        System.out.println("Multadd Test (1, 2, 3): " + multadd(1.0, 2.0, 3.0));

       
        
        final double PI_OVER_4 = Math.PI / 4;
        final double HALF_FACTOR = 0.5;
        
        double sinVal = Math.sin(PI_OVER_4);
        double cosVal = Math.cos(PI_OVER_4);
        
        double resultTrig = multadd(cosVal, HALF_FACTOR, sinVal);
        System.out.println("Trigonometri Sonucu: " + resultTrig);

       
        double resultLog = multadd(1.0, Math.log(10), Math.log(20));
        System.out.println("Logaritma Sonucu: " + resultLog);

      
        System.out.println("expSum(2.0) Sonucu: " + expSum(2.0));
    }

   
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

   
    public static double expSum(double x) {
       
        
        final double exponentialPart = Math.exp(-x);
        final double sqrtPart = Math.sqrt(1.0 - exponentialPart);
        
        return multadd(x, exponentialPart, sqrtPart);
    }
}
