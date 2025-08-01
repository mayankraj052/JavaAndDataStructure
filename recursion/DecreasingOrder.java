class DecreasingOrder{
  public static void main(String[] args){
     printDec(10);
  }
  public static void printDec(int num){
        if(num ==1){
        System.out.print(num+" ");
        return ;
     }
     printDec(num-1);
     System.out.print(num +" ");
  }
}
