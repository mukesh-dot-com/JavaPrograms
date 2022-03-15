class thread1 implements Runnable
{
String name;
long time;
int x;
thread1(String name,long time,int x) {
this.name = name;
this.x = x;
this.time=time;
Thread t=new Thread(this,name);
t.start();
}
public void run() {
try {
for(int i =x;i>0;i--) {
System.out.println(name);
Thread.sleep(time);
}
}
catch(InterruptedException e) {
System.out.println(name+ "Interrupted");
}
}
}

class TwoThread{
public static void main(String args[]) {
new thread1("BMS COLLEGE OF ENGINEERING",10000,2);
new thread1("CSE",2000,10);
}
}
