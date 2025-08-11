class Fibonacci{
    public static void main(String[] args){
      System.out.println(calcFibo(26));
    }

   static int calcFibo(int n){
    if(n == 0){
       return 0;
    }
    if(n ==1 ){
      return 1;
    }
    return calcFibo(n-1) + calcFibo(n-2);
   }
}

