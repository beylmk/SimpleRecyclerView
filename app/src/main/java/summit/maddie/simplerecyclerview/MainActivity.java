package summit.maddie.simplerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the recycler view
        RecyclerView awardList = (RecyclerView) findViewById(R.id.award_list);
        awardList.setHasFixedSize(true);

        // Create the linear layout manager for the recycler view
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        awardList.setLayoutManager(llm);

        // Set the adapter to the recycler view
        AwardViewAdapter awardViewAdapter = new AwardViewAdapter(getAwardList());
        awardList.setAdapter(awardViewAdapter);
        awardList.setItemAnimator(new DefaultItemAnimator());
    }

    private ArrayList<Award> getAwardList() {
        ArrayList<Award> awardList = new ArrayList<>();

        awardList.add(new Award("Best Motion Picture", "Moonlight"));
        awardList.add(new Award("Best Motion Picture - Musical or Comedy", "La La Land"));
        awardList.add(new Award("Best Director - Motion Picture", "Damien Chazelle"));
        awardList.add(new Award("Best Motion Picture - Animated", "Zootopia"));
        awardList.add(new Award("Best Television Series - Drama", "The Crown"));
        awardList.add(new Award("Cecil B. DeMille Award", "Meryl Streep"));

        for (int i = 1; i < 46; i++) {
            awardList.add(new Award("Award Number " + i, "Winner Number " + i));
        }
        return awardList;
    }
}
