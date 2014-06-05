package com.coa.worldcupwidget.app;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;

import java.util.List;

/**
 * Created by sushant on 6/5/14.
 */
public class MatchesViewFactory implements RemoteViewsService.RemoteViewsFactory {
    Context context;


    public MatchesViewFactory(Context applicationContext, Intent intent) {
        this.context = applicationContext;
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onDataSetChanged() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public RemoteViews getViewAt(int i) {
        RemoteViews listViewRow = new RemoteViews(context.getPackageName(), R.layout.listViewRow);

        listViewRow.setTextViewText(R.id.textViewGameTime, listMatches.get(i).get);
    }

    @Override
    public RemoteViews getLoadingView() {
        return null;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }
}
