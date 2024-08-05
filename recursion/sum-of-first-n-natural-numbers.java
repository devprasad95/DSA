public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        parameterized(0, 5);
        System.out.println(fn(5));
    }
    public static void parameterized(int  sum, int i){
        if(i == 0){
            System.out.println(sum);
            return;
        }
        parameterized(sum + i, i -1);
    }
    public static int fn(int n){
        if(n == 0){
            return 0;
        }
        return n + fn (n - 1);
    }
}
