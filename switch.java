import java.util.*;
class A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a)
        {
            case 0:
                System.out.println("monday");
                break;
           case 1:
                System.out.println("tuesday");
                break;
           case 2:
                System.out.println("wednesday");
                break;
           case 3:
                System.out.println("thursday");
                break;
           case 4:
                System.out.println("friday");
                break;
           case 5:
                System.out.println("saturdy");
                break;
            default:
                System.out.println("sunday");
                break;
        }
    }
}       
           