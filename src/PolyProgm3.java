



class parent11{  /*POLYMORPHIC VERSION */
    public void cry(){
        
        System.out.println("Parent Does not cry");
    }
    
}

class child111 extends parent11{
    
    @Override
    public void cry(){
        System.out.println("Child1 cries with low voice");
    }
    public void eat(){
        System.out.println("Child1 eats less food");
    }
}

class child222 extends parent11{
    
    @Override
    public void cry(){
        System.out.println("Child2 cries with medium voice");
    }
    public void eat(){
        System.out.println("Child2 etas average food");
    }
}

class child333 extends parent11{
    
    @Override
    public void cry(){
        System.out.println("Child3 cries with High voice");
    }
    public void eat(){
        
        System.out.println("Child3 eats more food");
    }
}
public class PolymProgm3{
    
    public static void main(String[] args){
        parent11 ref;
        
        child111 c1 = new child111();
        child222 c2 = new child222();
        child333 c3 = new child333();
        
        
        ref = c1;
        ref.cry();
        ref.eat();
        
        
        ref = c2;
        ref.cry();
        ref.eat();
        
        ref = c3;
        ref.cry();
        ref.eat();
    }
}



