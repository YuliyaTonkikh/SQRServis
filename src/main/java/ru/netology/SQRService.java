package ru.netology;

public class SQRService {
    private int left = 0; // левая граница диапазона
    private int right = 0; // правая граница диапазона
    private int countSquares = 0; // счетчик количества квадратов

    /*
        SQRService констурктор класса на вход принимает два значения
        вернхнюю и нижнюю границу диапазона
     */
    public SQRService(int left, int right) throws Exception {
        // если границы диапазона не соответствует условию выбрасываем исключание
        if (left == 0 || right == 0 || left > right) {
            throw new Exception("Неверный формат диапазона, значения должны соответствовать" +
                    " условию left != 0 и right !=0 и left < right ");
        } else {
            this.left = left;
            this.right = right;
        }
    }

    /*
        Поиск количества квадровто в последовательности от 10 до 99
        входящих в диапазон от left до right
     */
    public int findNumberOfSquares() {
        int i = 0;
        for (i = 10; i <= 99; i++) {
            int value = (int) Math.pow(i, 2);
            if (value >= this.left && value <= this.right) {
                this.countSquares++;
            }
        }
        return this.countSquares;
    }
}
