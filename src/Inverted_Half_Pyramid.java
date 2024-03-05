public class Inverted_Half_Pyramid {
    public static void main(String[] args){
        //        n =4
        int n= 4;
        for(int i = n;i>=1;i--){//only this changed from previous code
            for (int j = 1;j <=i;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
