package DsaFundamental;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,6,2,0,3,7,-1};
        int smallNum = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]< smallNum){
                smallNum = arr[i];
            }
        }
        System.out.println(smallNum);
    }
}
