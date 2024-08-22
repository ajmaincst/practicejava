class Array{
    public static  void main (String [] args){
        int [][] twoArray =new int [5][5];
        int row = 5;
        int col = 5;
        for(int a = 0; a<  row ; a++){
            for (int b = 0; b < col ; b++){
                twoArray [a][b]= a+b;
                System.out.println(twoArray [a][b]);

            }
        }

    }
}

