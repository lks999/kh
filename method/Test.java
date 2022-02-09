package com.oop.emp.method;

public class Test {
    int a = 100;
    static int s = 99;
    
    public static void main(String[] args) {
        Test t = new Test();
        t.test1();
        
        t.test2();
        
        Test t3 = new Test();
        t.test3(t3);
        System.out.println(t3.a); //예상 : 200 답 : 10
        
        
        t.test4(t);
            
    }

    public void test1() {
        int a = 1000;
        int s = 999;
        System.out.println(this.a);  //예상 : 1000 답 : 100
        System.out.println(Test.s);  //예상 : 99
    }

    public void test2() {
        Test t = new Test();
        t.a = 1000;
        System.out.println(a); //예상 : 1000 답: 100
    }

    public void test3(Test t) {
        t.a = 10;
        this.a = 200;
        System.out.println(t.a); //예상 : 200 답 : 10
    }

    public void test4(Test t) {
        t.a = 1000;
        System.out.println(this.a); //예상 : 1000
    }


}
