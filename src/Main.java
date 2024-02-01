public class Main {

    public static void main(String[] args) throws InterruptedException {

        // short-circuiting will be when a < 0.9 is false, then the second operand will not be evaluated
//        double a = 0;
//        int b = 0;
//        while (a < 0.9 && lessThanTen(b)) {
//            b = b + 1;
//            a = Math.random();
//        }
//        System.out.println(b);

        // short-circuiting will be when a < 0.9 is true, then the second operand will not be evaluated
//        double a = 0;
//        int b = 0;
//        while (a < 0.9 || lessThanTen(b)) {
//            b = b + 1;
//            a = Math.random();
//        }
//        System.out.println(b);

        // using short-circuiting in our advantage, when a != null is false, second part not checked and not getting the exception
//        String a = null;
//        if (a != null && a.length() > 10) {
//            System.out.println("Inside of if statement!");
//        } else {
//            System.out.println("Inside of else statement!");
//        }

//        test();


        // operator precedence from left to right, when we come to the ! operator it has the highest precedence
        // but usually because of short-circuiting most of the expression will be ignored
        // normally having 11 as result
        // with parentheses we have 1
        double a = 0;
        int b = 0;
        while (isLessThanOne(a) && (isLessThanTen(b) || !isOdd(b)) && isEven(b)) {
            b = b + 1;
            a = Math.random();
        }
        System.out.println(b);

    }

    static boolean complex() throws InterruptedException {
        System.out.println("Inside of complex() method!");
        Thread.sleep(3000);
        return true;
    }
    static boolean simple() throws InterruptedException {
        System.out.println("Inside of simple() method!");
        Thread.sleep(100);
        return true;
    }

    // using short-circuiting in our advantage to optimize the code execution
    // only simple() method will be called and since it is returning true, complex() will not be called at all
    static void test() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            if (simple() || complex()) {
                // do sth
            }
        }
    }

    static boolean isLessThanTen(int x) {
        System.out.println("We are in the lessThanTen method!");
        return x < 10;
    }

    static boolean isLessThanOne(double x) {
        System.out.println("We are in the lessThanZeroPoint9 method!");
        return x < 1;
    }

    static boolean isEven(int x) {
        return x % 2 == 0;
    }

    static boolean isOdd(int x) {
        System.out.println("We are in the isOdd method!");
        return x % 2 == 1;
    }
}