package ch_5;
class A{
  A(){System.out.println("hello a");}
  A(int x){
    this();
    System.out.println(x);
  }
}
@SuppressWarnings("unused")
class Test_This5{
  public static void main(String args[]){
    A a=new A(10);
  }
}