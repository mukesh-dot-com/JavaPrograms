package SEE;
import CIE.*;
import java.util.Scanner;
public class externals extends CIE.personal {
Scanner sc = new Scanner(System.in);
public int smarks[] = new int[5];
public void accept() {
System.out.println("Enter your see marks");
for(int i = 0;i<5;i++) {
System.out.println("Subject " +(i+1)+":");
smarks[i] = sc.nextInt();
}
}
}