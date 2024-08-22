public class TreeHouse {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 7;
        float x = 1, y = 2, z = 3;
        double aira = 5.43 , mawya = 2.44 , affan = 6.4;
        char  name1 = 'e' , name2 = 'j' , name3 = 'h';
        twoDimentionArray();
       // int[] array = new int[a];
     //   int rows = array.length;
       // for (int i = 0; i < rows; i++) {
       //     array[i] = i + 7;
        }


    static void twoDimentionArray(){
        int [][] clay = new int[4][3];
        int rows =4;
        int cols =3;
        for (int i = 0; i < rows; i++) {
            int j;
            for (j = 0; j < cols; j++) {
                clay[i][j] = i + j;
                System.out.println(clay[i][j]);
            }

        }
    }
}
// int diya 3 ta variable
// float diya 3 ta variable
// double diya 3 ta variable
// char diya 3 ta variable


// array 1d 2ta
// array 2d 2ta

// method 3 ta


