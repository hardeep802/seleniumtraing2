class Array2{
    static void min(int arr[]){
         int i;
         int min=arr[0];
         for(i=1;i<arr.length;i++){
         if(min > arr[i])
         min= arr[i];
}
System.out.println(min);
}
   public static void main(String[]args){
   int arr[]={33,4,6,2};
   min(arr);
}
}
