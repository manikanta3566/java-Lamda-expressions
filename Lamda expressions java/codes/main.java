package codes;

class Main {
    public static void main(String[] args) {

        // using anonymous class
        // myinterface mi = new myinterface() {

        // @Override
        // public void hello() {
        // System.out.println("hii");
        // }
        // };
        // mi.hello();

        // using lamda for interface 1
        myinterface mi1 = () -> {
            System.out.println("hii");
        };
        mi1.hello();

        //using lamda for interface2
        myinterface2 mi2 = (int a, int b) ->  a + b;
        System.out.println(mi2.add(10, 5));

        //using lamda for interface3
        myinterface3 mi3=(str)-> str.length();
         System.out.println( mi3.lengthOfString("helloworld"));
    }
}