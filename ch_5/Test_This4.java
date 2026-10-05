package ch_5;
class A{
  void m(){System.out.println("hello m");}
  void n(){
    System.out.println("hello n");
    //m();//same as this.m()
    this.m();
  }
}
class Test_This4{
  public static void main(String args[]){
    A a=new A();
    a.n();
  }
}