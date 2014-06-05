package com.coa.worldcupwidget.app;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by sushant on 6/5/14.
 */
public class WidgetService extends RemoteViewsService{
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return (new MatchesViewFactory(this.getApplicationContext(), intent));
    }
}
