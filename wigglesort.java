public class wigglesort{
  public static void main(String[] args)
    {
    int[] in = new int[]{1,2,3,4,5,6,7,8,9};
    for(int i=1;i< in.length;i++) {
        if(i %2  ==0) {
          wigglelow(in,i);
        } else wiggleup(in,i);
      }

      for(int i =0;i<in.length;i++){
        System.out.print(in[i] +"   ");
      }
    }
    public static void wigglelow(int[] n, int i) {
      int temp;
      if(n[i-1] < n[i]) {
        temp = n[i];
        n[i] = n[i-1];
        n[i-1] = temp;
      }
    }
    public static void wiggleup(int[] n, int i) {
      int temp;
      if(n[i-1] > n[i]) {
        temp = n[i];
        n[i] = n[i-1];
        n[i-1] = temp;
      }
    }
}
