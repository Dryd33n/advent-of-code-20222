import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CalorieCounting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line;
        int calorie = 0;
        ArrayList<Integer> calories = new ArrayList<>();


        System.out.println("Paste Input, press Ctrl+D when done:");

        while((sc.hasNextLine())) {
            line = sc.nextLine();



            if(Objects.equals(line, "")){
                if(calories.size() == 0){
                    calories.add(calorie);
                }
                else if(calorie > calories.get(0)){
                    calories.add(0, calorie);
                }else {
                    for(int i = 1; ;i++){
                        if(i == calories.size()){
                            calories.add(i, calorie);
                            break;
                        }

                        if( (calorie > calories.get(i- 1) ) && calorie > calories.get(i)){
                            calories.add(i-1, calorie);
                            break;
                        }
                    }
                }

                calorie = 0;

            }else{
               calorie = calorie + Integer.parseInt(line);
            }

        }

        System.out.println("Top 3 elves: \n1) " + calories.get(0)+"\n2) " + calories.get(1)+"\n3) " + calories.get(2));
        System.out.println("Top 3 elves total: " + (calories.get(0) + calories.get(1) + calories.get(2)));







    }
}
