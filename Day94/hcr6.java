package Day94;

class Cycle{
    String define(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends Cycle{
    String define(){
        return "a cycle with an engine.";
    }
    
    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define());
        String temp=super.define();
        System.out.println("My ancestor is a cycle who is "+ temp );
    }
    
}
class Solution{
    public static void main(String []args){
    }
}
