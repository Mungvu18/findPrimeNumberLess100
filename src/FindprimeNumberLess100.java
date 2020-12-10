public class FindprimeNumberLess100 {
    public static void main(String[] args) {
       for (int num =2; num<100;num++){
           if(testNumberPrime(num)){
               System.out.println(num+ " là số nguyên tố");
           }
       }
    }
    static boolean testNumberPrime(int num){
        if(num==2){
            return true;
        } else if (num>2){
            for (int i = 0; i < Math.sqrt(num); i++) {
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
