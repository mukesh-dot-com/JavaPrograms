import java.lang.Exception;
class threadX extends Thread {
int i;
String str;
threadX(int i,String str) {
this.i = i;
this.str = str;
}
public void run() {
try {
System.out.println(str+" is "+i);
}
catch(Exception e) {
System.out.println("Exception ocurred "+e);
}
}
}
class threadY implements Runnable {
int i;
String str;
threadY(int i ,String str) {
this.i = i;
this.str = str;
Thread t = new Thread(this,"Thread");
t.start();
}
public void run() {
try {
for(int i=0;i<5;i++) {
System.out.println(str+ " is "+i);
Thread.sleep(1000);
}
}
catch(Exception e) {
System.out.println("Exception ocurred "+e);
}
}
}

class ThreadProg {
public static void main(String args[]) {
threadX t1 = new threadX(100,"Dolo-650");
t1.start();
threadY t2 = new threadY(120,"Aspirin");
}
}
