class TwoDimention {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int row = 5;
        int col = 3;
        for (int i =0; i<row; i++){
            for (int j =0; j<col; j++){
                a[i][j] = i+j;

                System.out.println(a[i][j]);
            }
        }
    }

}
//empty 2 array
//loop 1
//loop 2
    //[][] = i +j