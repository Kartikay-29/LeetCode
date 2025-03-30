import java.util.*;

class Solution {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        int[][] P = new int[26][2]; // (start, end)
        for (int i = 0; i < 26; i++) {
            P[i][0] = n;
            P[i][1] = -1;
        }
        
        for (int i = 0; i < n; i++) {
            int x = s.charAt(i) - 'a';
            P[x][0] = Math.min(i, P[x][0]);
            P[x][1] = i;
        }
        
        // Process the intervals
        List<Integer> pLen = new ArrayList<>();
        int start = 0, end = -1;
        
        for (int i = 0; i < n; i++) {
            int x = s.charAt(i) - 'a';
            end = Math.max(end, P[x][1]);
            if (i == end) {
                pLen.add(end - start + 1);
                start = i + 1;
            }
        }
        
        return pLen;
    }
}