package mhealth.movil.salt.mhealthcolombia.fragments;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import mhealth.movil.salt.mhealthcolombia.R;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;

/**
 * Created by pc on 03/05/2015.
 */
public class NoticiasFragment extends ListFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final UserTimeline userTimeline = new UserTimeline.Builder().screenName("ClusterCreaTIC").build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter(getActivity(), userTimeline);
        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.noticias_fragment, container, false);
    }
}
