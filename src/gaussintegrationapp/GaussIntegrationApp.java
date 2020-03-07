package gaussintegrationapp;


public class GaussIntegrationApp {

   
    public static void main(String[] args) {
        final double[] t = {-0.9491079, -0.74153119, -0.40584515, 0.0,
            0.40584515, 0.74153119, 0.9491079
        };
        final double[] A = {0.12948496, 0.27970540, 0.38183006, 0.41795918,
            0.38183006, 0.27970540, 0.12948496
        };
        
        final int N = 7;
        
        int a = 0;
        int b = 4;
        
        double [] x = new double[N];
        for(int i = 0; i < N; i++)
            x[i] = (b + a) / 2 + ((b - a) / 2) * t[i];
        
        double[] y = new double[N];
        for(int i = 0; i < N; i++)
            y[i] = 1 / (1 + Math.sqrt(Math.abs(x[i])));   
        
        double integral = 0;
        for(int i = 0; i < N; i++){
            integral += A[i] * y[i];
            //System.out.println(integral);
        }
        integral *= (b - a) / 2;
        
        System.out.println("Function: 1/(1+sqrt(x))");
        System.out.println("[" + a + "]" + "[" + b +"]");
        System.out.println("Gauss's method");
        System.out.println("****************");
        System.out.println("Integral = " + integral);  
    }
    
}
