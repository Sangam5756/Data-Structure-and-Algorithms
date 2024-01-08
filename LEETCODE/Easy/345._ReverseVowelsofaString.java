class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Check left arr and check for vowel if found then left++
            while (left < right && vowels.indexOf(arr[left]) == -1) {
                left++;
            }
            // Check right arr and check for vowel if found then right--
            while (left < right && vowels.indexOf(arr[right]) == -1) {
                right--;
            }

            // after founding we swap the position
            
            if (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        // Return the arr in string
        return String.valueOf(arr);
    }
}
