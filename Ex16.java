class CSphere{
    private int x;
    private int y;
    private int z;
    private int radius;
 
    void setLocation(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    void setRadius(int r){
        this.radius=r;
    }
    double surfaceArea(){
        return 4*Math.PI*Math.sqrt(this.radius);
    }
    double volume(){
        return (double)4/3*Math.PI*Math.pow(this.radius,3);
    }
    void showCenter(){
       System.out.printf("(%d,%d,%d)",this.x,this.y,this.z);
    }
        
}
public class Ex16{
    public static void main(String[] args){
        CSphere cs=new CSphere();
        cs.setLocation(3,4,5);
        cs.setRadius(1);
        System.out.println("surfaceArea="+cs.surfaceArea());
        System.out.println("volume="+cs.volume());
        cs.showCenter();
    }
}
