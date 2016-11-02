package in.habel.android.applock.Utils;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import in.habel.android.applock.AppLockApplication;
 
public class AppLockLogEvents {

  public static void logEvents(String screenName, String eventAction, String eventName, String eventLabel) {
        /*-------Google Analytics--------*/
    Tracker t = AppLockApplication.getInstance().getTracker(AppLockApplication.TrackerName.APP_TRACKER);
    t.setScreenName(screenName);
    t.send(new HitBuilders.EventBuilder()
            .setAction(eventAction)
            .setLabel(eventLabel)
            .setCategory(eventName)
            .build());
  }
}
