package summit.maddie.simplerecyclerview;

/**
 * Created by rfl518 on 1/9/17.
 */

public class Award {

    private String mName;

    private String mWinner;

    public Award (String name, String winner) {
        mName = name;
        mWinner = winner;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getWinner() {
        return mWinner;
    }

    public void setWinner(String winner) {
        mWinner = winner;
    }

}
