
package OVERRIDING;

class Demo11{
     public void disp(){
            System.out.println("Hello Students");
    }
}

class Demo22 extends Demo11{
@Override
 public int disp(){            /*Try replacing int with void */

    System.out.println("Hello..............");
}

}

public class OverridingProgms2 {
    public static void main(String[] args){
        Demo11 d1;
        d1 = new Demo11();
        Demo22 d2 = new Demo22();
        d1.disp();
        d2.disp();
    }
}
