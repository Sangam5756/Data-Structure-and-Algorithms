class Solution {
    public int compress(char[] chars) {
         StringBuilder ere =new StringBuilder();

        for(int i=0;i<chars.length;i++) {
            Integer count=1;
            while(i<chars.length-1 && chars[i] == chars[i + 1]){
                   count++;
                   i++;
            }
            ere.append(chars[i]);

            if(count>1){
                ere =ere.append(count);
            }
        }
        char[] comparr = ere.toString().toCharArray();
        System.arraycopy(comparr, 0, chars, 0, comparr.length);

        return comparr.length;

    }
}