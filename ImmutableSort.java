import java.util.Arrays;

public class ImmutableSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        int[] b = new int[3];
        for (int i = 0; i < a.length; i++){
            for (int o = 0; o < a.length; o++){
                if(a[i] < a[o]){
                    int temp = a[i];
                    a[i] = a[o];
                    a[o] = temp;
                }
            }
        }
        b[0] = a[0];
        b[1] = a[1];
        b[2] = a[2];

        System.out.println(Arrays.toString(b));

        
    }
}
