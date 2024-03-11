class Solution {
    public String customSortString(String order, String s) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
        StringBuilder str = new StringBuilder("");
        for(int i=0; i<s.length();i++){
            hm.put(s.charAt(i) ,  hm.getOrDefault(s.charAt(i), 0 ) +1 );
        }

        // the loop for order 
        // check order string is present in the map
        // if yes then the adding to str and decrementing its count
        // instead of removing because character can be occurs more than once
        for(int i=0; i<order.length(); i++){
            char c = order.charAt(i);
               while (hm.containsKey(c) && hm.get(c) > 0) {
                str.append(c);
                hm.put(c, hm.get(c) - 1);
        }
        }
        // we are adding the remaining character to String
         for (char i : hm.keySet()) {
            while (hm.get(i) > 0) {
                str.append(i);
                hm.put(i, hm.get(i) - 1);
            }
        }
      
         

        return str.toString();


      
    }
}

