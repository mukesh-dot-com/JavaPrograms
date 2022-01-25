package CIE;
import java.util.*;
public class internals{
Scanner sc = new Scanner(System.in);
public int cmarks[] = new int[5];
public void accept() {
System.out.println("Enter your cie marks");
for(int i = 0;i<5;i++) {
System.out.println("Subject "+(i+1)+":");
cmarks[i] = sc.nextInt();
}
}
}
