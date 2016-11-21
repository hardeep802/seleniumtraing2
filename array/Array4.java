class Array4{
     
public static void main(String[]args){
 int a[][]= {{2,3,4},{6,7,7}};
      int b[][]= {{1,2,4},{5,7,9}};
      int i;
      int j;
      int c[][]= new int[2][3];
    for(i=0;i<2;i++){
    for(j=0;j<3;j++){
         c[i][j] = (a[i][j] + b[i][j]);
     System.out.print(c[i][j]+" ");
     }
     System.out.println();
     }}
}