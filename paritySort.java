class paritySort {
    public int[] sortArrayByParity(int[] A) {
        int p = 0;//initial pointer
        int temp = 0;
        for(int i=0;i< A.length;i++){
            if(A[i] % 2 == 0) {
                temp = A[p];
                A[p] = A[i];
                A[i] = temp;
                p++;
            } 
        }
        return A;
    }
}
