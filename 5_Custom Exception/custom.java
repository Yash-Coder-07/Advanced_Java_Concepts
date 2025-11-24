class MyException extends Exception{
    public MyException(String string){
        super(string);
    }
}
public class custom {
    public static void main(String[] args) {
        int i = 20;   
        int j = 0;

        try {
            j = 18 / i;  // j becomes 1

            if (j == 0) {
                throw new MyException("I dont want to print zero..");
            }

        }
        catch (MyException e) {
            j = 18 / 1;
            System.out.println("Thats the default output: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
