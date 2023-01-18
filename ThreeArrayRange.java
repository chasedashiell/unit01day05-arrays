public class ThreeArrayRange {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        int min = 10000;
        int max = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < min){
                min = a[i];
            }
            if (a[i] > max){
                max = a[i];
            }
        }
        int range = max - min;
        System.out.println(range);
    }
}
