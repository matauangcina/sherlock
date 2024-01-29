package androidx.databinding.adapters;

import android.widget.DatePicker;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.library.baseAdapters.C0274R;
/* loaded from: classes.dex */
public class DatePickerBindingAdapter {
    public static void setListeners(DatePicker view, int year, int month, int day, DatePicker.OnDateChangedListener listener, InverseBindingListener yearChanged, InverseBindingListener monthChanged, InverseBindingListener dayChanged) {
        if (year == 0) {
            year = view.getYear();
        }
        if (day == 0) {
            day = view.getDayOfMonth();
        }
        if (yearChanged == null && monthChanged == null && dayChanged == null) {
            view.init(year, month, day, listener);
            return;
        }
        DateChangedListener oldListener = (DateChangedListener) ListenerUtil.getListener(view, C0274R.C0277id.onDateChanged);
        if (oldListener == null) {
            oldListener = new DateChangedListener();
            ListenerUtil.trackListener(view, oldListener, C0274R.C0277id.onDateChanged);
        }
        oldListener.setListeners(listener, yearChanged, monthChanged, dayChanged);
        view.init(year, month, day, oldListener);
    }

    /* loaded from: classes.dex */
    private static class DateChangedListener implements DatePicker.OnDateChangedListener {
        InverseBindingListener mDayChanged;
        DatePicker.OnDateChangedListener mListener;
        InverseBindingListener mMonthChanged;
        InverseBindingListener mYearChanged;

        private DateChangedListener() {
        }

        public void setListeners(DatePicker.OnDateChangedListener listener, InverseBindingListener yearChanged, InverseBindingListener monthChanged, InverseBindingListener dayChanged) {
            this.mListener = listener;
            this.mYearChanged = yearChanged;
            this.mMonthChanged = monthChanged;
            this.mDayChanged = dayChanged;
        }

        @Override // android.widget.DatePicker.OnDateChangedListener
        public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            DatePicker.OnDateChangedListener onDateChangedListener = this.mListener;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(view, year, monthOfYear, dayOfMonth);
            }
            InverseBindingListener inverseBindingListener = this.mYearChanged;
            if (inverseBindingListener != null) {
                inverseBindingListener.onChange();
            }
            InverseBindingListener inverseBindingListener2 = this.mMonthChanged;
            if (inverseBindingListener2 != null) {
                inverseBindingListener2.onChange();
            }
            InverseBindingListener inverseBindingListener3 = this.mDayChanged;
            if (inverseBindingListener3 != null) {
                inverseBindingListener3.onChange();
            }
        }
    }
}
