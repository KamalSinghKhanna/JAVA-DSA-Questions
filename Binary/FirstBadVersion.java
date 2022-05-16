package Binary;

public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(firstBadVersion(n));
    }

        static int firstBadVersion(int n) {
            int start = 0;
            int end = n;
            while(start<=end){
                int mid = start + (end - start)/2;
                if(isBadVersion(mid)){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            }
            return start;
        }

        static boolean isBadVersion(int mid) {
            int bad = 4;
            if (mid == bad) {
                return true;
            }

            return false;
        }
}
