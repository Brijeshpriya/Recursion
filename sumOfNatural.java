public class sumOfNatural {
    public static void sumNub(int i,int n,int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return ;
        }
        sum=sum+i;
        sumNub(i+1,n,sum);
    }
    public static void main(String[] args) {
        sumNub(1,5,0);
        
    }
    
}
