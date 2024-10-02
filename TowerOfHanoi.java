public class TowerOfHanoi {
    public static void TOF(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk" +" " +n+" "+ "from" +" " +src+" " +"to"+ " " +dest);
            return;
        }
        TOF(n-1,src,dest,helper);
        System.out.println("Transfer disk" +" " +n+" "+ "from" +" " +src+" " +"to"+ " " +dest);
        TOF(n-1,helper,src,dest);
        
    }
    public static void main(String[] args) {
        int n=3;
        TOF(n,"S","H","D");
        
    }
    
}
