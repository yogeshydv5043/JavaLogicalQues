package Integer_types;

public class FindLargestDigit {

    public static int findLargest(int [] arr){
        int largest=arr[0];
        for(int i=0; i<arr.length;i++){
            if(largest < arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int[] arr={12,33,44,22,55,93,88};
        System.out.println("Largest is : "+findLargest(arr));

    }
}
