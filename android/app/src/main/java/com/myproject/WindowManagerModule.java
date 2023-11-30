// WindowManagerModule.java
package com.myproject;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

// import android.app.src.main.res.layout.overlay_layout.xml
public class WindowManagerModule extends ReactContextBaseJavaModule {

    private static final String MODULE_NAME = "WindowManagerModule";
    private final ReactApplicationContext reactContext;
    private WindowManager windowManager;
    private View overlayView;
    private int previousX;
    private int previousY;

    public WindowManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
        this.windowManager = (WindowManager) reactContext.getSystemService(reactContext.WINDOW_SERVICE);
    }

    @Override
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void showOverlay() {
        // Inflate a simple overlay view
        overlayView = LayoutInflater.from(reactContext).inflate(R.layout.overlay_layout, null);
        mViewIcon = new MyGroupView(this);
        View view = View.inflate(this, R.layout.overlay_layout, mViewIcon);
        Button tvIcon = (Button) view.findViewById(R.id.supabutton);
        tvIcon.setOnTouchListener(this);

        // Set the layout parameters for the overlay view
        WindowManager.LayoutParams params = new WindowManager.LayoutParams();
        params.width = WindowManager.LayoutParams.WRAP_CONTENT;
        params.height = WindowManager.LayoutParams.WRAP_CONTENT;
        params.gravity = Gravity.CENTER;
        params.format = android.graphics.PixelFormat.TRANSLUCENT;
        params.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        // params.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        
      
            
             
               
        

        // Add the overlay view to the WindowManager
        windowManager.addView(overlayView, params);
    }

    @ReactMethod
    public void dismissOverlay() {
        // Remove the overlay view from the WindowManager
        if (overlayView != null) {
            windowManager.removeView(overlayView);
        }
    }
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOW:
                
        }
    }
}