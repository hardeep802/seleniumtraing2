class Student12{
        int rollno;
        String name;
        static String colg = "BITS";// use static method to change the value of static variable

  static void change(){
        String colg= "ITS";}
  Student12(int r,String n){
        r= rollno;
        n=name;
        System.out.println(rollno+","+name+","+colg);}
  public static void main(String[]args){
        Student12 s1= new Student12(111,"Karan");
        Student12 s2= new Student12(222,"Aryan");
}
}