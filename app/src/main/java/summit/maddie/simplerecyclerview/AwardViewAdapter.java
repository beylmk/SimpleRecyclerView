package summit.maddie.simplerecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rfl518 on 1/9/17.
 */

public class AwardViewAdapter extends RecyclerView.Adapter<AwardViewAdapter.AwardViewHolder> {

    private List<Award> mAwardList;

    // Create constructor for use in the SummiteerFragment, where we give it the list of Summiteers
    public AwardViewAdapter(List<Award> awardList) {
        mAwardList = awardList;
    }

    // Inflate the row layout specific to our Summiteer recycler view
    @Override
    public AwardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
            from(parent.getContext()).
            inflate(R.layout.award_row_layout, parent, false);

        return new AwardViewHolder(itemView);
    }

    // Here is where we get the data from the Summiteer list and put it in our view holder
    @Override
    public void onBindViewHolder(AwardViewHolder holder, int position) {
        Award awardAtPosition = mAwardList.get(position);
        holder.awardName.setText(awardAtPosition.getName());
        holder.awardWinner.setText(awardAtPosition.getWinner());
    }

    // Find the size of the Summiteer list
    @Override
    public int getItemCount() {
        return mAwardList.size();
    }

    /**
     * The view holder finds the views in the row layout that we want to modify in the view adapter
     * We find the id for the name and school text view in the row layout xml file, so we can set above in onBindViewHolder
     */
    public class AwardViewHolder extends RecyclerView.ViewHolder {

        protected TextView awardName;
        protected TextView awardWinner;

        public AwardViewHolder(View itemView) {
            super(itemView);

            awardName = (TextView) itemView.findViewById(R.id.award_name_text_view);
            awardWinner = (TextView) itemView.findViewById(R.id.award_winner_text_view);
        }
    }
}
