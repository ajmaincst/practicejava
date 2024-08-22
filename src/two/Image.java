class Image{

    static int [] [] array = new int [6][6];
    static int rows = 6;
    static int cols = 6;

    public static void main(String[]args){
        for(int a = 0; a< rows ; a++){
            for(int b = 0; b< cols ; b++){
                array [a][b]= a+b;
                System.out.println(array[a][b]);
            }
        }
    }
}