import java.util.*;
class student {
String name,usn;
int credits[];
double marks[];
int n,i;
float total = 0;
int totalcredits = 0;
Scanner sc = new Scanner(System.in);
void input() {
System.out.println("Enter your name");
name = sc.nextLine();
System.out.println("Enter your usn");
usn = sc.nextLine();
System.out.println("Enter number of subjects");
n = sc.nextInt();
marks = new double[n];
credits = new int[n];

for(int i = 0;i<n;i++) {
System.out.println("Enter "+(i+1)+" Subject marks");
marks[i] = sc.nextDouble();
System.out.println("Enter "+(i+1)+" Subject credits");
credits[i] = sc.nextInt();
calc(marks[i],credits[i],i);
}
}
void calc(double marks,int credits,int i) {
totalcredits = totalcredits + credits;
if(marks>=90 && marks<=100)
total = total + (10*credits);
else if(marks>=80 && marks<90)
total = total + (9*credits);
else if(marks>=70 && marks<80)
total = total + (8*credits);
else if(marks>=60 && marks<70)
total = total + (7*credits);
else if(marks>=50 && marks<60)
total = total + (6*credits);
else if(marks>=40 && marks<50)
total = total + (5*credits);
else {
System.out.println("Subject "+(i+1)+"Failed");
}
}
void display() {
System.out.println("Details");
System.out.println("Name :"+name);
System.out.println("USN :"+usn);
System.out.println("SGPA :"+(total/totalcredits));
}
}

class studdet {
public static void main(String args[]) {
student s1 = new student();
s1.input();
s1.display();
}
}
