package at.technikum.digitsumapi;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigitSumCounter {

    private static int DigitSumCount = 0;

    public static int calculateDigitSum(@RequestParam int number) {
        DigitSumCount++;

        return number;
    }

    public static int getUsageCount() {
        return DigitSumCount;
    }

    public static void resetUsageCount() {
        DigitSumCount = 0;
    }
    }
