package ru.netology.sqr;

public class SQRService {
    public int limitedSquaring(int number) {
        int output = 0;
        for (int i = number; i >= 10 && i <= 99; i++) {
            if (i * i >= 200 && i * i <= 300) {
                output = output + 1;
            }
        }
        return output;
    }
}
