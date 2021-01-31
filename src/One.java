import java.util.Scanner;

public class One {
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int num1 = getInt();
            int num2 = getInt();
            char operstion = getOperation();
            int result = cals(num1, num2,operstion);
            System.out.print("Результат операции:" + result);
    }
    public static int getInt() {
            System.out.println("Введите число: ");
            int num;
            if(scanner.hasNextInt()) {
                num = scanner.nextInt();
            } else {
                System.out.println("Вы допустили ошибку, введите число ещё раз.");
                scanner.next();
                num = getInt();

            }
            return num;
    }
    public static char getOperation(){
            System.out.println("Введите операцию: ");
            char operation;
            if(scanner.hasNext()) {
                operation = scanner.next().charAt(0);
            }else {
                System.out.println("Вы допустили ошибку, введите число ещё раз.");
                scanner.next();
                operation = getOperation();
        }
            return operation;
    }
    public static int cals (int num1, int num2, char operation) {
            int result;
            switch (operation){
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Ввод был не верный, повторите.");
                    result = cals(num1, num2,getOperation());
            }
            return result;
    }
}
