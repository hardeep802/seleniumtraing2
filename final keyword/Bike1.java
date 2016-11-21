class Bike1{
final void run(){System.out.println("running");}
}
class Honda extends Bike1{
void run(){Sysyem.out.println("running safely");}
public static void main(String[]args){
Honda b1 = new Honda();
b1.run();
}
}