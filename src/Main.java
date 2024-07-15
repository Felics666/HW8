import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int MonthlyExpenses = 0; /// Общая сумма трат за месяц
        int minExpenditurePerWeek; /// Минимальная сумма трат
        int maxExpenditurePerWeek; //// Максимальная сумма трат
        double averageAmountSpent;  //// Средняя сумма трат
        double MonthlyExpenses2 = 0; /// Общая сумма трат за месяц задачи № 3

        ////Задача 1
        System.out.println("Задача 1");

        int[] AccountingBook = new int[] {2354, 6543, 43212, 134465, 23986};

        for (int i = 0; i < AccountingBook.length; i++) {
            MonthlyExpenses += AccountingBook[i];
        }
        System.out.println("Сумма трат за месяц составила - " + MonthlyExpenses + " рублей.");


        ///// Задача 2
        System.out.println();
        System.out.println("Задача 2");

        int[] AccountingBook2 = new int[] {2351, 2366, 34221, 3466, 1277};

        minExpenditurePerWeek = AccountingBook2[0];
        maxExpenditurePerWeek = AccountingBook2[0];

        for (final int current : AccountingBook2) {
            if (current < minExpenditurePerWeek) {
                minExpenditurePerWeek = current;
            }
            if (current > maxExpenditurePerWeek) {
                maxExpenditurePerWeek = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила - " + minExpenditurePerWeek + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила - " + maxExpenditurePerWeek + " рублей");


        //// Задача 3
        System.out.println();
        System.out.println("Задача 3");

        int[] AccountingBook3 = new int[] {2346, 3422, 9883, 4578, 1237};

        for(int i = 0; i < AccountingBook3.length; i++){
            MonthlyExpenses2 += AccountingBook3[i];
        }
        averageAmountSpent = MonthlyExpenses2 / AccountingBook2.length;
        System.out.println("Средняя сумма трат за месяц составила - " + averageAmountSpent + " рублей");


        ///// Задача 4
        System.out.println();
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for(int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}