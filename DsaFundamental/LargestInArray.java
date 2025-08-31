package DsaFundamental;

public class LargestInArray {
    public static void main(String[] args) {
        int[] num = {10,23,9,7, 9,11,0};
        int maxNum = num[0];
        for(int i =1 ;i<num.length;i++){
            if(num[i] > maxNum){
                maxNum = num[i];
            }
        }
        System.out.println(maxNum);
    }
}
