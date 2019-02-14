
class parent{  //*NON POLYMORPHIC VERSION */
    public void cry(){
        
        System.out.println("Parent Does not cry");
    }
}

class child1 extends parent{
    
    public void cry(){
        System.out.println("Child1 cries with low voice");
    }
}

class child2 extends parent{
    
    public void cry(){
        System.out.println("Child2 cries with medium voice");
    }
}

class child3 extends parent{
    
    public void cry(){
        System.out.println("Child3 cries with High voice");
    }
}
public class PolymProgm1 {
    
    public static void main(String[] args){
        
        child1 c1 = new child1();
        child2 c2 = new child2();
        child3 c3 = new child3();
        
        
        c1.cry();
        c2.cry();
        c3.cry();
    }
}
