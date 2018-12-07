public interface DoSmething {
    void doSmething();
}
class Worker implements DoSmething {
    @Override
    public void doSmething() {
        System.out.println("I'am working");
    }


}
class Operation<A,B>{

    public static void main(String[] args) {
        Operation<String,Integer> o1= new Operation<>();
        Operation<Integer,Worker> o2 = new Operation<>();
        m1(o1);
        m1(o2);
//        m2(o1);
        m2(o2);
    }
    public static void m1(Operation<?, ?> p) {
        System.out.println(p);
    }
    public static void m2(Operation<?, ? extends DoSmething > p ){
        System.out.println(p);
    }
}
