import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Bins  {
    private static final Logger LOGGER = Logger.getLogger(Bins.class.getName());

    public Integer first;
    public Integer last;
    ArrayList<Integer> holder;


    public Bins(Integer first, Integer last) {
        this.first = first;
        this.last = last;
        this.holder = new ArrayList<>();
        for (int i = 0; i <= last; i++) {
            this.holder.add(0);
        }
    }



    public Integer getBin(Integer binNum) {
        return holder.get(binNum);
    }

    public void incrementBin(Integer value) {
        Integer newValue = holder.get(value);
        newValue++;
        holder.set(value,newValue);

    }

    public ArrayList<Integer> getHolder(){
        return holder;
    }

    public Integer getFirst(){
        return first;
    }

    public Integer getLast() {
        return last;
    }


}