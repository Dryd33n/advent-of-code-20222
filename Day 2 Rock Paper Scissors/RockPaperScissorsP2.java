import javax.xml.stream.events.Characters;
import java.util.Objects;

public class RockPaperScissorsP2 {
    static int score;

    public static void main(String[] args) {
        for(int i = 0; i <args.length; i += 2) {
            score += scoreCounter((byte) (args[i].getBytes()[0] + 23), args[i + 1].getBytes()[0]);
        }

        System.out.println(score);
    }

    public static Integer scoreCounter(Byte charByte1, Byte charByte2){

        if (charByte2 == 89) return 3 + (charByte1 - 87);
        else if (charByte2 == 90) {
            if(charByte1 == 90) return 7;
            else return 6 +(charByte1 - 86);
        }else {
            if(charByte1 == 88) return 3;
            else return charByte1 - 88;
        }
    }
}
