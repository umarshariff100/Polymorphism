
package OVERRIDING;

class Demo1{
     public void disp(){
            System.out.println("Hello Students");
    }
}

class Demo2 extends Demo1{
@Override
   void disp(){            /*Try removing the public */

    System.out.println("Hello..............");
}

}

public class OverridingProgm1 {
    public static void main(String[] args){
        Demo1 d1= new Demo1();
        Demo2 d2 = new Demo2();
        d1.disp();
        d2.disp();
    }
}
