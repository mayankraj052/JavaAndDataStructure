class Factorial{
   public static void main(String[] args){
      System.out.println(factorialCalc(5));
   }
   
   static int factorialCalc(int num){
      if(num ==0){
        return 1;
      }
      if(num ==1){
        return 1;
      }
      return num * factorialCalc(num-1);
   }
}
