package com.coa.worldcupwidget.app;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;

/**
 * Created by sushant on 6/5/14.
 */
public class WidgetProvider extends AppWidgetProvider{
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        for(int i = 0; i < appWidgetIds.length; i++){
            Intent serviceIntent = new Intent(context, WidgetService.class);

            serviceIntent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, appWidgetIds[i]);
            serviceIntent.setData(Uri.parse(serviceIntent.toUri(Intent.URI_INTENT_SCHEME)));

            RemoteViews widget = new RemoteViews(context.getPackageName(), R.layout.widget_listview);

            widget.setRemoteAdapter(appWidgetIds[i], R.id.listViewWidget,serviceIntent);

            appWidgetManager.updateAppWidget(appWidgetIds[i], widget);


        }
    }
}
