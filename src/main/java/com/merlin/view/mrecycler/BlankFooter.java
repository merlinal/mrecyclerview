package com.merlin.view.mrecycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/12/20.
 */

public class BlankFooter extends AbstractFooterView {

    public BlankFooter(@NonNull Context context) {
        super(context);
    }

    public BlankFooter(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public View initLoadView() {
        return new View(getContext());
    }

    @Override
    public void onLoadBefore() {

    }

    @Override
    public void onLoadStart() {

    }

    @Override
    public void onLoadPulling(float offsetY, float deltaY, float rate) {

    }

    @Override
    public void onLoadReady() {

    }

    @Override
    public void onLoading() {

    }

    @Override
    public void onLoaded() {

    }

    @Override
    public void onLoadCancel() {

    }

    @Override
    public void onLoadFinished() {

    }

    @Override
    public void onLoadOver() {

    }
}
