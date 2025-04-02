public class Palindrome{

    public static void main(String args[]){
                System.out.println(isPalindrome("madam"))
    }

    public static boolean isPalindrome(String str){

        String strReverse = reverse(str);
        if(str === strReverse){
            return true;
        }

        return false;
    }


    public static String reverse (String str){
        chars[] str = str.toCharArray();

        int left = 0; int right = str.length-1;

        while(left < right){
            char temp = str[left];
            str[left]=str[right];
            str[right]=temp;

            left++;
            right--;
        }
        return new String(str);

    }
}