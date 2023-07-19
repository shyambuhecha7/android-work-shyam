package com.example.onecloudandroid.databinding;
import com.example.onecloudandroid.R;
import com.example.onecloudandroid.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecyclerItemBindingImpl extends RecyclerItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imgThreeDot, 7);
        sViewsWithIds.put(R.id.imgCall, 8);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecyclerItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private RecyclerItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[2]
            );
        this.callDateIcon.setTag(null);
        this.callDateTime.setTag(null);
        this.callTime.setTag(null);
        this.callTimeIcon.setTag(null);
        this.imgProfileIcon.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvProfileTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.data == variableId) {
            setData((com.example.onecloudandroid.model.ItemData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.example.onecloudandroid.model.ItemData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String dataCalenderDate = null;
        java.lang.String dataItemTitle = null;
        int dataImgProfile = 0;
        int dataImgIconCall = 0;
        java.lang.String dataCallTime = null;
        int dataImgCalendarIcon = 0;
        com.example.onecloudandroid.model.ItemData data = mData;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.calenderDate
                    dataCalenderDate = data.getCalenderDate();
                    // read data.itemTitle
                    dataItemTitle = data.getItemTitle();
                    // read data.imgProfile
                    dataImgProfile = data.getImgProfile();
                    // read data.imgIconCall
                    dataImgIconCall = data.getImgIconCall();
                    // read data.callTime
                    dataCallTime = data.getCallTime();
                    // read data.imgCalendarIcon
                    dataImgCalendarIcon = data.getImgCalendarIcon();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.onecloudandroid.activities.RecycleViewActivityKt.setImageView(this.callDateIcon, dataImgCalendarIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.callDateTime, dataCalenderDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.callTime, dataCallTime);
            com.example.onecloudandroid.activities.RecycleViewActivityKt.setImageView(this.callTimeIcon, dataImgIconCall);
            com.example.onecloudandroid.activities.RecycleViewActivityKt.setImageView(this.imgProfileIcon, dataImgProfile);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProfileTitle, dataItemTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}