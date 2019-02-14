class Animal{
    public void sleep(){
        System.out.println("Animal is sleepling");
    }
    public void breath(){
        System.out.println("Animal is breathing");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
}




class tiger extends Animal{
    
    @Override
     public void sleep(){
        System.out.println("Animal is sleepling");
    }
    @Override
    public void breath(){
        System.out.println("Animal is breathing");
    }
    @Override
    public void eat(){
        
        System.out.println(" Tiger eats by hunting");
    }
    public void size(){
        System.out.println("Tiger size is very huge");
    }
}

class deer extends Animal{
    
    @Override
     public void sleep(){
        System.out.println("Animal is sleepling");
    }
    @Override
    public void breath(){
        System.out.println("Animal is breathing");
    }
    @Override
    public void eat(){
        System.out.println("Deer eats by grazing");
    }
    public void size(){
        
        System.out.println("Deer size is relatively Medium");
    }
}

class monkey extends Animal{
    
    @Override
     public void sleep(){
        System.out.println("Animal is sleepling");
    }
    @Override
    public void breath(){
        System.out.println("Animal is breathing");
    }
    @Override
    public void eat(){
        System.out.println("Monkey eats always by stealing");
    }
    public void size(){
        
        System.out.println("Monkey size is relatively small");
    }
}

class Forest{
    
    public void permit1(Animal ref){
        ref.eat();
        ref.sleep();
        ref.breath();
    }
}
public class PolymProgm8 {
    
    public static void main(String[] args){
        
        tiger t = new tiger();
        deer d = new deer();
        monkey m = new monkey();
        
        Forest f = new Forest();
        f.permit1(t);
        System.out.println();
        f.permit1(d);
        System.out.println();
        f.permit1(m);
       
    }
}

