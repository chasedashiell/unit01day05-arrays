public class ThreeArrayProduct {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        // FIXME: this isn't a product
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        System.out.println(sum);
    }
}