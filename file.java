public class Main{
    public static void main(String [] args){
        System.out.println("Hello");
        one obj = new two();
        obj.func1();
    }
}
class one{
    public void func1(){
        int n = 1;
        n++;
        
    }
}
class two extends one{
    @Override
    public void func1(){
        int n = 2;
        System.out.println(n);
    }
}
