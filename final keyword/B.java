class B{
   int void cube(final int n){
       n=n+1;
       int cube = n*n*n;
       System.out.println(cube);}
   public static void main(String[]args){
       B obj= new B();
       obj.cube(5);
}
}