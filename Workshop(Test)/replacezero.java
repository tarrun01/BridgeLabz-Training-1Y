public class replacezero {
    public static void main(String[] args) {
        int num=2307060;
        String str = Integer.toString(num);
        String res = str.replace('0', '1');
        System.out.println(res);
    }
}
