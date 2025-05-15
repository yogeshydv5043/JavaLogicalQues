package Integer_types;

public class FinallyBlockNotExecute {

    public static void run(){
        try {
            System.out.println("<<<<< TRY BLOCK >>>>>>");
            Runtime.getRuntime().halt(0); //way 1
            System.exit(1); // way 2
            while (true) {} //way 3
        } finally {
            System.out.println("Won't run until loop ends");
        }

    }

    public static void main(String[] args) {
        run();
        System.out.println("Hello");
    }
}
