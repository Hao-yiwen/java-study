package org.example.generator;

public class SonBoo extends Boo{
    public SonBoo(){
        super("boo");
    }

    public SonBoo(int i){
        super("ads");
    }

    public SonBoo(String s){
        super(42);
    }

//    error
//    public SonBoo(int i,String s){
//    }

//    error
//    public SonBoo(String a, String b, String c){
//        super(a, b);
//    }


}
