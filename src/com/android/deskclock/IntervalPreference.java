/*******************************************************************************
 *
 *    Copyright (c) Baina Info Tech Co. Ltd
 *
 *    DeskClock
 *
 *    IntervalPreference
 *    TODO File description or class description.
 *
 *    @author: danliu
 *    @since:  Feb 7, 2014
 *    @version: 1.0
 *
 ******************************************************************************/
package com.android.deskclock;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;

/**
 * IntervalPreference of DeskClock.
 * @author danliu
 *
 */
public class IntervalPreference extends ListPreference {

    public IntervalPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setValue(String value) {
        super.setValue(value);
        setSummary(getEntry());
    }

}
