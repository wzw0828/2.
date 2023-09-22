class CTest
{
    public void test(int x){
        if (x==0){
             System.out.println("此數為0 ");
            
        }
        else if (x%2==0){
             System.out.println("此數為偶數");
        }
        else if (x%2!=0){
             System.out.println("此數為奇數");
        }
        
    }
}
public class Ex07{
    public static void main(String arge[])
    {
        CTest test;
        test=new CTest();
        test.test(3);
        test.test(8);
        test.test(0);
        
    }
}
