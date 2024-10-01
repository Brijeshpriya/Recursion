public class Factorial {
    public static int factorial(int n){
        if(n==1 ||n==0){
            return 1;
        }
       int facnm1= factorial(n-1);
       int fac=n*facnm1;
       return fac;
    }
    public static void main(String[] args) {
        int f=factorial(5);
        System.out.println(f);
    }
    
}
