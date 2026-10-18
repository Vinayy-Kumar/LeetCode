class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int minT = 0;
        int m = 0, p = 0, g = 0;

        for (int i = 0; i < garbage.length; i++) {
           //normal garbaeg collection for each type.
            minT += garbage[i].length();

            for (int j = 0; j < garbage[i].length(); j++) {
                char ch = garbage[i].charAt(j);

                if (ch == 'M') {
                    m = i;
                } else if (ch == 'P') {
                    p = i;
                } else if (ch == 'G') {
                    g = i;
                }
            }
        }
        for (int i = 0; i < garbage.length; i++) {
            if (i < m) {
                minT += travel[i];
            }
            if (i < p) {
                minT += travel[i];
            }
            if (i < g) {
                minT += travel[i];
            }

        }

        return minT; 
    }
}