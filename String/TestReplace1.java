class TestReplace1{
     public static void main(String[]args){
         String s="jfkejf@*$kgfljkl!&)*&";
         int i1= s.indexOf('@');
         int i2= s.indexOf('!');
         System.out.println(i1);
         System.out.println(i2);
         System.out.println(s.substring(i1,i2));
         s=s.replace("@*$kgfljkl","     ");
         System.out.println(s);
 }
 }

