import java.util.Scanner;

class Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
            int k = Integer.parseInt(sc.nextLine());
            int n = Integer.parseInt(sc.nextLine());
            int count = 0;
            int number = 1;
            while (true) {
                if (number % k == 0 ||
                        Integer.toString(number).contains(Integer.toString(k))) {
                    count++;
                    if (count == n) {
                        System.out.println(number);
                        break;
                    }
                }
                number++;
            }
        
    }
}