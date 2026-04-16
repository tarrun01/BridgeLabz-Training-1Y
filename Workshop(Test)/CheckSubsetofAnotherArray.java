public class CheckSubsetofAnotherArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4 , 5};
        boolean isSubset = true;
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                isSubset = false;
                break;
            }
        }
        if (isSubset) {
            System.out.println("As,arr1 contains all the elements of arr2");
        } else {
            System.out.println("No, arr2 is not a subset of arr1");
        }
    }
}
