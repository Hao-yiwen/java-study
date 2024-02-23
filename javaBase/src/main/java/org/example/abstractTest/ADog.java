package org.example.abstractTest;

public class ADog extends Dog {
    Season test;

    public Season getTest() {
        return test;
    }

    public void setTest(Season test) {
        this.test = test;
    }

    public ADog(String name) {
        super(name);
    }

    @Override
    public void a() {
        System.out.println("重写");
    }

//    @Override
//    public void b(){
//        System.out.println("重写");
//    }

    public static void main(String[] args) {
        ADog a = new ADog("A");
        a.setTest(Season.Summer);
        a.MakeSound();
        a.a();
        a.b();
    }
}
