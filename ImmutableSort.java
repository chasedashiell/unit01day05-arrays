import java.util.Arrays;

public class ImmutableSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        int[] b = new int[3];
        b[0] = a[0];
        b[1] = a[1];
        b[2] = a[2];
        for (int i = 0; i < b.length; i++){
            for (int o = 0; o < b.length; o++){
                if(b[i] < b[o]){
                    int temp = b[i];
                    b[i] = b[o];
                    b[o] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(b));

        
    }
}
