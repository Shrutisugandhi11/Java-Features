package PrivateMethod;

public class PrivateMethodDemo {

    private void request(Object object){
        PrivateMethodInInterface privateMethodInInteface=new PrivateMethodInIntefaceDemo();
        System.out.println( privateMethodInInteface.info(object.getClass().getSimpleName(),"Starting processing....."));
        //some more logics...
        System.out.println( privateMethodInInteface.error(object.getClass().getName(),"encountered an error...." ));
        //some more code logic
        System.out.println( privateMethodInInteface.debug(object.getClass().getName(),"Debugging code, Please check logs..."));
        //some more industry logic

    }
    public static void main(String[] args) {
        PrivateMethodDemo privateMethodDemo=new PrivateMethodDemo();
        privateMethodDemo.request(privateMethodDemo);
    }
}
