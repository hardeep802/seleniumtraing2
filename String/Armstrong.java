class Armstrong{
public static void main(String[]args){
String number="153";
int result=0;
for(int i=number.length();i>0;i--){
    int j= Integer.parseInt(number.charAt(i-1) + "");
    int cube = j*j*j;
    result= result + cube;
}
System.out.println(result);
}
} 