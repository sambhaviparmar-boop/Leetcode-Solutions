class Solution {
    public int firstUniqChar(String s) {
        // int[] freq = new int[26];

        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     freq[ch - 'a']++;
        // }
        // for (int j = 0; j < s.length(); j++) {
        //       char ch = s.charAt(j);
        //     if (freq[ch - 'a'] == 1) {
        //         return j;
        //     }
            
        // }
        // return -1;


        HashMap<Character , Integer> m = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

           m.put(ch , m.getOrDefault(ch , 0)+1); //char ki frequency bda denge

            q.offer(i);

        while(!q.isEmpty() && m.get(s.charAt(q.peek())) > 1){
            q.poll();
        }
        }

        return q.isEmpty() ? -1 : q.peek();

    }
}