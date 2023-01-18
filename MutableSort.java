import java.util.Arrays;

public class MutableSort {
    public static void main(String[] args) {
        int[] a = {4, 0, 3};
        for (int i = 0; i < a.length; i++){
            for (int o = 0; o < a.length; o++){
                if(a[i] < a[o]){
                    int temp = a[i];
                    a[i] = a[o];
                    a[o] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
