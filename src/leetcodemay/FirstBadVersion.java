package leetcodemay;

public class FirstBadVersion {
    private int firstBadVersion;

    public boolean isBadVersion(int version) {

        return version >= this.firstBadVersion;
    }

    public void setFirstBadVersion(int version) {
        this.firstBadVersion = version;
    }

    public int firstBadVersion(int n) {
        int mg = 0;
        int mb = n;
        while (true) {
            int midpoint = ((mb - mg) >> 1) +mg;
            boolean isBadVersion = isBadVersion(midpoint);
            if (isBadVersion){
                mb = midpoint;
            }
            else {
                mg = midpoint;
            }
            if (((mb - mg) ==1 ) ){
                return mb;
            }
            System.out.println(mg +":"+ mb);
            Math.abs(-1);
        }
    }
}
