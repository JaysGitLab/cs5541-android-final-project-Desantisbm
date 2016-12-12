package desantisenterprise.ascabcapoeirahub;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;

public class MyExpandableAdapter extends BaseExpandableListAdapter {

    private Activity activity;
    private ArrayList<Object> duckling;
    private LayoutInflater inflater;
    private ArrayList<String> duck, egg;
    //private ArrayList<PlayGifView> egg;

    public MyExpandableAdapter(ArrayList<String> parents, ArrayList<Object> children) {
        this.duck = parents;
        this.duckling = children;
    }

    public void setInflater(LayoutInflater inflater, Activity activity) {
        this.inflater = inflater;
        this.activity = activity;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {


        egg = (ArrayList<String>) duckling.get(groupPosition);
        //egg = (ArrayList<PlayGifView>) duckling.get(groupPosition);


        TextView textView = null;
        //PlayGifView gif = null;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.group, null);
        }

        //PlayGifView gif = (PlayGifView) convertView.findViewById(R.id.viewGif);
        //gif.setImageResource(R.drawable.placeholder);

        textView = (TextView) convertView.findViewById(R.id.textList);
        textView.setText(egg.get(childPosition));


    return convertView;

}

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.row, null);
        }

        ((CheckedTextView) convertView).setText(duck.get(groupPosition));
        ((CheckedTextView) convertView).setChecked(isExpanded);

        return convertView;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return ((ArrayList<String>) duckling.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    @Override
    public int getGroupCount() {
        return duck.size();
    }

    @Override
    public void onGroupCollapsed(int groupPosition) {
        super.onGroupCollapsed(groupPosition);
    }

    @Override
    public void onGroupExpanded(int groupPosition) {
        super.onGroupExpanded(groupPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

}