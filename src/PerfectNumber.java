import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

    private List<Long> sumsOfPowerOf2 = new ArrayList<>();


    private List<Long> primaryFilter(List<Long> filterThis){
        List<Long> filteredList = new ArrayList<>();
        filterThis.forEach(e -> {
            boolean isPrimary = true;
            for(int i = 2; i < e; i++){
                if(e % i == 0){
                    isPrimary = false;
                }
            }

            if(isPrimary){
                filteredList.add(e);
            }

        });


        return filteredList;
    }






    public List<Long> findPerfectNumbers(int giveMeANumber){
        List<Long> perfectNumbersList = new ArrayList<>();
        sumsOfPowerOf2.add((long) 1);

        for(int i = 1; i <= giveMeANumber; i++){
            sumsOfPowerOf2.add((long) (sumsOfPowerOf2.get(i-1)+Math.pow(2, i)));

        }

        List<Long> filteredSumsOfPowerOf2 = new ArrayList<>(primaryFilter(sumsOfPowerOf2));
        filteredSumsOfPowerOf2.forEach(e -> {

            int i = 1;
            while(Math.pow(2, i) < e){
                i++;
            }


            perfectNumbersList.add((long) (e*(Math.pow(2, i-1))));



        });




        perfectNumbersList.remove(0);
        filteredSumsOfPowerOf2.remove(0);
        System.out.println("Primary numbers allowed to reach perfection: " + filteredSumsOfPowerOf2);
        return perfectNumbersList;

    }

}
