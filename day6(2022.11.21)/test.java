public class test{


public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    String answer = sc.nextLine();

    answer = answer.replace("()","\");

    System.out.println(answer);

}

}

