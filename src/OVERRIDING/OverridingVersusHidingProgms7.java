
package OVERRIDING;

class parent{
    
    public void disp1(){
            System.out.println("ABC");
}
     static void disp2(){
            System.out.println("DEF");
}
}

class child extends parent{
    
    @Override
    public void disp1(){
        System.out.println("XYZ");
    }
    @Override
     static void disp2(){
        System.out.println("PQR");
    }
}
public class OverridingVersusHidingProgms7 {
    public static void main(String[] args){
        child c = new child();
        c.disp1();
        c.disp2();
    }
}
