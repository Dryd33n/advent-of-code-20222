import javax.xml.stream.events.Characters;
import java.util.Objects;

public class RockPaperScissors {
    static int score;

    public static void main(String[] args) {
        for(int i = 0; i <args.length; i += 2) {
            score += scoreCounter((byte) (args[i].getBytes()[0] + 23), args[i + 1].getBytes()[0]);
        }

        System.out.println(score);
    }

    public static Integer scoreCounter(Byte charByte1, Byte charByte2){
        if (Objects.equals(charByte1, charByte2)) return 3 + (charByte2 - 87);
        else if (charByte2 == charByte1 + 1 || charByte2 + 2 == charByte1) return 6 + (charByte2 - 87);
        else return (charByte2 - 87);
    }
}
