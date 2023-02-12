package ru.netology.sqr;

public class SqrtService {
    public int RangSqrt(int min, int max) {
        int i;
        for (i = 10; i <= 99; i++) {
            if (min <= i * i && i * i <= max) {
                System.out.print(i + " ");
                continue;
            }
            int result;
            result = i;  if (min <= i * i && i * i <= max) {
                System.out.print(i + " ");
            }
        }
        return i;
    }
}