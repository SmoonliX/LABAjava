public class ArrayAverage {
    public static void main(String[] args) {
        String[] arr = {"1","two","3","4","5"};
        int sum = 0;
        int count = 0;

        try {
            for (String str : arr) {
                int num = Integer.parseInt(str);
                sum += num;
                count++;
            }

            if (count == 0) {
                throw new ArithmeticException("Массив пустой, невозможно найти среднее арифметическое.");
            }

            double average = (double) sum / count;
            System.out.println("Среднее арифметическое: " + average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы массива.");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: элемент массива не является числом.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
