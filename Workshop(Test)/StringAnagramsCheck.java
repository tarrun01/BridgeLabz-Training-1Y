public class StringAnagramsCheck {
    public static void main(String[] args) {
        String str1 = "elbow";
        String str2 = "below";
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        boolean isAnagram = java.util.Arrays.equals(arr1, arr2);
        if (isAnagram) {
            System.out.println("Yes, the strings are anagrams of each other.");
        } else {
            System.out.println("No, the strings are not anagrams of each other.");
        }

    }
}
