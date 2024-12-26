package unit3;
public class factorial 
{
    static int factoria(int n)
    {
        int res= 1,i;
            for(i=2;i<=n;i++)
            {
                res *=i; //res=res*i=>res=1,i=2=>2*1=2(res),n=5,res=2,i=3=>res*i=2*3=6(res)
            }
        return res;
    }
    // main method
    public static void main(String[]args)
    {
        int num=5;
        System.out.println("factorial of " +num+" is " +factoria(5));
    }
}
