package ru.netology.sqr;

public class SQRService {
    public int limitedSquaring(int lowerLimit, int upperLimit) {
        int output = 0;
        for (int i = 10; i >= 10 && i <= 99; i++) {
            if (i * i >= lowerLimit && i * i <= upperLimit) {
                output++;
            }
        }
        return output;
    }
}