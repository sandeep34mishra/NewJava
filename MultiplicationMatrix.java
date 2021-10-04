public class MultiplicationMatrix {
    public static void main(String args[]){
        int mat1[][]={{2,2},{4,4}};
        int mat2[][]={{2,2},{4,4}};
        int mulMat[][]=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                mulMat[i][j]=0;
                for(int k=0;k<2;k++)
                {
                    mulMat[i][j]+=mat1[i][k]*mat2[k][j];
                }
                System.out.print(mulMat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
