package BackUp;

public class VoteElegible
{



            public static void main(String[] args) {
                int age = 20;
                boolean elegible = elegibles(age);
                if (elegible) {
                    System.out.println("The person is eligible to vote.");
                } else {
                    System.out.println("The person is not eligible to vote.");
                }

            }

            public static boolean elegibles(int age) {
                return age >= 18;
            }
        }





