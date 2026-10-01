import java.util.* ;
public class Addition_sc {

    static int add()
    { Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b= sc.nextInt();
        int res = a+b;
        return(res);
    }
    public static void main(String[] args)  {
       int res= add();
        System.out.println(res);
    }
}