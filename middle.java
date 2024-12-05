public class middle
{
    public static void main(String[] args)
    {
        int a=10;
        int b=15;
        int c=20;
        if(a>b)
        {
            if(b>c)
            {
                System.out.println("b");
            }
            else if(a>c)
            {
                System.out.println("c");
            }
            else
            {
                System.out.println("a");
            }
        }
        else
        {
            if(a>b)
            {
                System.out.println("a");   
            }
            else if(b>c)
            {
                System.out.println("c");
            }
            else
            {
                System.out.println("b");
            }
        }
    }
}

