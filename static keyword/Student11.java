class Student11{
        int rollno;
        String name;
        static String colg = "BITS";// use static method to change the value of static variable

   Student11(int r,String n){
        r= rollno;
        n=name;
        System.out.println(rollno+","+name+","+colg);}
   public static void main(String[]args){
        Student11 s1= new Student11(111,"Karan");
        Student11 s2= new Student11(222,"Aryan");
}
}


