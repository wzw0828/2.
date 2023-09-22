class CBox
{
    int length;
    int width;
    int height;
    public int volume(int x,int y,int z){
        return x*y*z;
    }
    public int surfaceArea(int x,int y){
        return x*y*6;
    }
    public void showData(int x,int y,int z){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public void showAll(int x,int y,int z,int a,int b){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
    }
}
public class Ex05{
    public static void main(String arge[])
    {
        CBox box;
        box=new CBox();
        box.length=1;
        box.width=1;
        box.height=1;
        
        System.out.println(box.volume(box.length,box.width,box.height));
        System.out.println(box.surfaceArea(box.length,box.width));
        box.showData(box.length,box.width,box.height);
        box.showAll(box.length,box.width,box.height,box.surfaceArea(box.length,box.width),
                    box.volume(box.length,box.width,box.height));
    }
}
