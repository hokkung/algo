package org.example.array;

public class ClimbingStarImpl implements ClimbingStar {
    @Override
    public int process(int n) {
        int last = 1;
        int secLast = 1;
        for (int i=0;i<n-1;i++) {
            int temp = last;
            last = last + secLast;
            secLast = temp;
        }

        return last;
    }
}
