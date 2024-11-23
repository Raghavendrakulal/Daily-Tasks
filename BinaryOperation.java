public class BinaryOperation{
    public static void count1s(int number){
        int count=0;
        while(number>0){
            count=count+(number&1);
            number=number>>1;
        }
        System.out.println("Count of number os 1s is  "+count);
    }
    public static void main(String[] args) {
        int number=10;
        int number1=10;
        int number2=16;

        int andresult=number1 & number2;
        System.out.println("Add result is  "+andresult);

        int orresult=number1 | number2;
        System.out.println("Or result is  "+orresult);

        int xorresult=number1 ^ number2;
        System.out.println("Xor result is  "+xorresult);

         int notresult=~number;
        System.out.println("Xor result is  "+notresult);

        int rightshift=number>>2;
        System.out.println("Right Shift "+rightshift);

        int leftshift=number<<2;
        System.out.println("left shift "+ leftshift);

        count1s(number);


        
    }

}