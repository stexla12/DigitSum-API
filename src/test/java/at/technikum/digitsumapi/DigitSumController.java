package at.technikum.digitsumapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigitSumController {

    Implementation i = new Implementation();
    @RequestMapping("/Digitsum")
    public int calculateDigitSum(@RequestParam int number) {
        int digitSum = 0;
        int absNumber = Math.abs(number);

        while (absNumber > 0) {
            digitSum += absNumber % 10;
            absNumber /= 10;
        }

        return digitSum;
    }

    }
