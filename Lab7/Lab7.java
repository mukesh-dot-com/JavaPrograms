class Gen<T,Q> {
T ob1;
Q ob2;
Gen(T o1, Q o2) {
ob1 = o1;
ob2 = o2;
}
T show1() {
return ob1;
}

Q show2() {
return ob2;
}
void showType() {
System.out.println("Value of T is"+ob1.getClass().getName());
System.out.println("Value of Q is"+ob2.getClass().getName());
}
}

class Twogen2 {
public static void main(String args[]) {
Gen<Integer,String> iob;
iob = new Gen<Integer,String>(100,"Evening");

int x = iob.show1();

System.out.println("The value of x is "+" "+x);
String y = iob.show2();
System.out.println("The value of y is"+y);
iob.showType();
}
}
