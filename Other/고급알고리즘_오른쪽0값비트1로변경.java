public class 고급알고리즘_오른쪽0값비트1로변경 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("result = " + setRightmostUnsetBit(n));
    }
    public static int setRightmostUnsetBit(int n){
        if (n==0) return 1;
        if ((n & (n + 1)) == 0) return n;
        int pos = getPosOfRightmostSetBit(n);
        return ((1 << pos) | n);
    }
    public static int getPosOfRightmostSetBit(int n){
        return (int)baseLog(~n&(n+1),2);
    }
    static double baseLog(double x, double base) {

        return Math.log10(x) / Math.log10(base);

    }

}
