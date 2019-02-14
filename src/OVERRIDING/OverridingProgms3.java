
package OVERRIDING;

class Animal{
    
}
class Tiger extends Animal{
    
}


class Demo111{
    public Animal disp(){
        System.out.println("Hello Students");
        Animal a = new Animal();
        return a;                         
        
    }
}

class Demo222 extends Demo111{
    
    @Override
    public Tiger disp(){
        System.out.println("Hello.................");
        Tiger t = new Tiger();
        return t;
    }
}
public class OverridingProgms3 {
    public static void main(String[] args){
        Demo111 d1 = new Demo111();
        d1.disp();
        Demo222 d2 = new Demo222();
        d2.disp();
       
    }
}
