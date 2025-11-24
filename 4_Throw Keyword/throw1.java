public class throw1 {
    public static void main(String[] args) {
        int i = 18;   
        int j = 0;

        try {
            j = 18 / i;  // j becomes 1

            if (j == 0) {
                throw new ArithmeticException("I dont want to print zero");
            }
            if (j == 1) { 
                throw new ArithmeticException("I dont want to print zero");
            }

        }
        catch (ArithmeticException e) {
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
