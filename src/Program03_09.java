import java.util.Scanner;
public class Program03_09 {
    //Задача 1: Четное или нечетное число
    /*public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println("Число " + number + " является четным");
            } else {
                System.out.println("Число " + number + " является нечетным");
            }

            scanner.close();
        }*/
    //Задача 2: Минимальное из трех чисел

    /* public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        System.out.println("Минимальное число: " + min);
        scanner.close();
    }*/
    //Задача 3: Таблица умножения
    /*public static void main (String[] args)
    {
        int number = 5;
        System.out.println("Таблица умножения на " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }*/
    //Задача 4: Сумма чисел от 1 до N
    /*public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Сумма всех чисел от 1 до " + N + " равна: " + sum);
        scanner.close();
    }*/
    //Задача 5: Число Фибоначчи
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("Пожалуйста, введите положительное целое число.");
        } else {
            System.out.println("Первые " + N + " чисел Фибоначчи:");
            printFibonacci(N);
        }
        scanner.close();
    }
    public static void printFibonacci(int N) {
        int a = 0, b = 1;
        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }*/
    //Задача 6: Проверка простого числа
    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " является простым числом.");
        } else {
            System.out.println(number + " не является простым числом.");
        }
        scanner.close();
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }*/
    //Задача 7: Обратный порядок чисел
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
        scanner.close();
    }*/
    //Задача 8: Сумма четных чисел
    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число : ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе целое число : ");
        int num2 = scanner.nextInt();
        int sum = 0;
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех четных чисел в диапазоне от " + num1 + " до " + num2 + " равна: " + sum);
        scanner.close();
    }*/
    //Задача 9: Реверс строки
    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Строка в обратном порядке: " + reversed);
        scanner.close();
    }*/
    //Задача 10: Количество цифр в числе
    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String input = scanner.nextLine();
        if (input.startsWith("-")) {
            input = input.substring(1);
        }
        int digitCount = input.length();
        System.out.println("Количество цифр в числе: " + digitCount);
        scanner.close();
    }*/
    //Задача 11: Факториал числа
    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        if (N < 0) {
            System.out.println("Факториал отрицательного числа не определен.");
        } else {
            long factorial = calculateFactorial(N);
            System.out.println("Факториал " + N + " равен: " + factorial);
        }
        scanner.close();
    }
    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }*/
    //Задача 12: Сумма цифр числа
    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String input = scanner.nextLine();
        int sum = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        System.out.println("Сумма всех цифр числа: " + sum);
        scanner.close();
    }*/
    //Задача 13: Палиндром
    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = isPalindrome(cleanedInput);
        if (isPalindrome) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндромом.");
        }
        scanner.close();
    }
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }*/
    //Задача 14: Найти максимальное число в массиве
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int max = findMax(array);
        System.out.println("Максимальное число в массиве: " + max);

        scanner.close();
    }
    private static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    } */
    //Задача 15: Сумма всех элементов массива
     /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int sum = calculateSum(array);
        System.out.println("Сумма всех элементов массива: " + sum);
        scanner.close();
    }
    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }*/
    //Задача 16: Количество положительных и отрицательных чисел
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int positiveCount = 0;
        int negativeCount = 0;
        for (int num : array) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        System.out.println("Количество положительных чисел: " + positiveCount);
        System.out.println("Количество отрицательных чисел: " + negativeCount);
        scanner.close();
    }*/
    //Задача 17: Простые числа в диапазоне
     /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int A = scanner.nextInt();
        System.out.print("Введите число B: ");
        int B = scanner.nextInt();
        if (A > B) {
            System.out.println("Ошибка: A должно быть меньше или равно B.");
            return;
        }

        System.out.println("Простые числа в диапазоне от " + A + " до " + B + ":");
        for (int num = A; num <= B; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }*/
    //Задача 18: Подсчет гласных и согласных в строке
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;
        String lowerCaseInput = input.toLowerCase();
        for (char ch : lowerCaseInput.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Количество гласных букв: " + vowelCount);
        System.out.println("Количество согласных букв: " + consonantCount);
        scanner.close();
    }
    public static boolean isVowel(char ch) {
        return "aeiouy".indexOf(ch) != -1;
    }*/
    //Задача 19: Перестановка слов в строке
    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        System.out.println("Слова в обратном порядке: " + reversed.toString());
        scanner.close();
    }*/
    //Задача 20: Число Армстронга
    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        if (isArmstrong(number)) {
            System.out.println(number + " является числом Армстронга.");
        } else {
            System.out.println(number + " не является числом Армстронга.");
        }
        scanner.close();
    }
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }
        return sum == originalNumber;
    }*/
}


