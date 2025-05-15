package Integer_types;

public class SingleLoopSorting {

    public static int [] sort(int[] array){
        int i = 0;
        while (i < array.length-1) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if (i > 0) {
                    i--;
                }
            }else {
                    i++;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        for(int num:sort(arr)){
            System.out.print(" "+num);
        }
    }
}
