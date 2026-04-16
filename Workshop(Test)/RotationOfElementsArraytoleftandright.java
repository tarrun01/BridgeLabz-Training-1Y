public class RotationOfElementsArraytoleftandright {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        int k = 3;
        System.out.println("Array after left rotation:");
        for (int i = k; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array after right rotation:");
        for (int i = n - k; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n - k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
