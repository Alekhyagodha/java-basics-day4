public class MethodsDemo {

        int add(int a, int b){
            int c=a+b;
            return c;
        }
        public static void main(String[] args){
            MethodsDemo method = new MethodsDemo();
            int res=method.add(2,4);
            System.out.println(res);

        }
    }

