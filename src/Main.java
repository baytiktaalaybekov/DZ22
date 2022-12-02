import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Random random=new Random();
        ArrayList<Integer>numbers = new ArrayList();
        ArrayList<Integer>numbers1 = new ArrayList();
        ArrayList<Integer>numbers2 = new ArrayList();

        for (int i = 0; i < 50 ; i++) {
            int ran = random.nextInt(1,100);
            numbers.add(ran);
            if(ran % 2 == 0){
                numbers1.add(ran);
            }else {
                numbers2.add(ran);
            }

        }System.out.println(numbers);
        System.out.println(numbers1);
        System.out.println(numbers2);



        }

    }

