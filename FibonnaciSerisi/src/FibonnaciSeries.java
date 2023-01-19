import java.util.Scanner;
public class FibonnaciSeries {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int s1=0,s2=1,s3,i,s;
        System.out.print("N Sayısını Girin:");
        s = input.nextInt();
        System.out.print(s1+" "+s2);

        for(i=2;i<s;++i)
    {
        s3=s1+s2;
        System.out.print(" "+s3);
        s1=s2;
        s2=s3;
    }
        System.out.println();
}
}

