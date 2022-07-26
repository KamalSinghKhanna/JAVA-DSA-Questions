

public class minimumDistance {
    public static void main(String[] args) {
      int[] a = {1, 2, 3, 4, 10};
      System.out.println(minimumDistances(a));
    }

    static int minimumDistances(int[] a) {
        // Write your code here
        //first we will check if there are occurrence of any number in list
        int min = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    int d = j-i;
                    if(d< min){
                        min = d;
                    }
                }else{
                    return -1;
                }
            }
        }
        return min;
        }
    
}
