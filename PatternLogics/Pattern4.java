//image is under imgs directory with same name i.e Pattern4
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,p=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%2!=0)
                {
                    System.out.print(p);
                    p++;
                    
                }
                else
                {
                  System.out.print("*");  
                }
            }
            System.out.println();
        }
	}

}
