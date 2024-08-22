 class Prime {
    public static void main(String[] args) {
        int i,j;
        System.out.println("Series of Prime number upto 25 is:\n");
        for(i=2;i<=25;i++) {
            for (j = 2; j <= 25; j++)
            {
                if(i%j==0){
                    break;
                }
            }
            if(j>(i/j)){

            }
        }
    }
}

