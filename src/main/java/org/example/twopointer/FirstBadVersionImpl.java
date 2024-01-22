package org.example.twopointer;

public class FirstBadVersionImpl implements FirstBadVersion {

    @Override
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        if (n < 2) {
            return 1;
        }

        while (l < r) {
            int m = l+ (r-l)/ 2;
            boolean check = isBadVersion(m);
            System.out.println("check : "+m);
            System.out.println("check res: "+check);
            if (!check) {
                l = m + 1;
                continue;
            }

            if (isBadVersion(m - 1)) {
                r = m - 1;
                continue;
            }
            return m;
        }
        return l;
    }

    private boolean isBadVersion(int m) {
        return m >= 5;
    }
}
