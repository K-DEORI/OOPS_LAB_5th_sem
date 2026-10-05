package ch_5;
class Demo{
    static int a =42;
    static int b= 99;
    static void callme(){
        System.out.println("a= "+ a);
    }
}

class StaticByName{
    public static void main(String[] args) {
        Demo.callme();
        System.out.println("b = "+ Demo.b);
    }
}