//package recursion;
class CheckSorted{
   public static void main(String[] args){
     int arr[] = {1,2,3,4,5};
     int arr2[] = {3,2,4,6,1};
     System.out.println(checkSorted(arr, 0));
     System.out.println(checkSorted(arr2, 0));
   }
   static boolean checkSorted(int arr[], int i){
       if(arr.length <=1){
           return true;
       }
       if(i == arr.length-1){
           return true;
       }
       if(arr[i] > arr[i+1]){
           return false;
       }
       return checkSorted(arr, i+1);
   }
}
