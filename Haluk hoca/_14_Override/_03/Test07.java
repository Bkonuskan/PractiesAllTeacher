package _14_Override._03;

public class Test07 {

        public  Integer getLenght(){
            return new Integer(4);
        }
    }

class Super extends Test07 {

    public  Integer getLenght(){
        return new Integer(5);
    }


    public static void main(String[] args) {
        Test07 sooper=new Test07();
        Super sub =new Super();
        System.out.println(sooper.getLenght().toString()+" "+sub.getLenght().toString());

    }

}


