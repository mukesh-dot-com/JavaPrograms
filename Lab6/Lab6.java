import CIE.*;
import SEE.*;
import java.util.*;
class totalmarks {
public static void main(String args[]) {
int i,j,n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of students :");
n = sc.nextInt();
int total[] = new int[5];
CIE.personal p[] = new CIE.personal[n];
CIE.internals cie[] = new CIE.internals[n];
SEE.externals exm[] = new SEE.externals[n];
for(i = 0;i < n;i++) {
System.out.println("Enter student "+(i+1)+" details-");
p[i] = new CIE.personal();
p[i].accept();
cie[i] = new CIE.internals();
cie[i].accept();
exm[i] = new SEE.externals();
exm[i].accept();
}

for(i=0;i<n;i++) {
System.out.println("Details of student "+(i+1));
p[i].display();
for(j=0;j<5;j++) {
total[j] = cie[i].cmarks[j] + exm[i].smarks[j];
System.out.println("Total marks in subject "+(j+1)+": "+total[j]);
}
System.out.println();
}
}
}
