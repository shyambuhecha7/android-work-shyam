package com.example.onecloudandroid.databinding;
import com.example.onecloudandroid.R;
import com.example.onecloudandroid.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLogoutBindingImpl extends ActivityLogoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(17);
        sIncludes.setIncludes(0, 
            new String[] {"profile_item3"},
            new int[] {9},
            new int[] {com.example.onecloudandroid.R.layout.profile_item3});
        sIncludes.setIncludes(1, 
            new String[] {"profile_item", "profile_item", "profile_item"},
            new int[] {4, 5, 6},
            new int[] {com.example.onecloudandroid.R.layout.profile_item,
                com.example.onecloudandroid.R.layout.profile_item,
                com.example.onecloudandroid.R.layout.profile_item});
        sIncludes.setIncludes(2, 
            new String[] {"profile_item2", "profile_item2"},
            new int[] {7, 8},
            new int[] {com.example.onecloudandroid.R.layout.profile_item2,
                com.example.onecloudandroid.R.layout.profile_item2});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 3);
        sViewsWithIds.put(R.id.profileImg, 10);
        sViewsWithIds.put(R.id.profileName, 11);
        sViewsWithIds.put(R.id.tvEmail, 12);
        sViewsWithIds.put(R.id.container1, 13);
        sViewsWithIds.put(R.id.container2, 14);
        sViewsWithIds.put(R.id.container3, 15);
        sViewsWithIds.put(R.id.bottomNavigationView, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLogoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityLogoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (com.google.android.material.bottomnavigation.BottomNavigationView) bindings[16]
            , (com.google.android.material.card.MaterialCardView) bindings[13]
            , (com.google.android.material.card.MaterialCardView) bindings[14]
            , (com.google.android.material.card.MaterialCardView) bindings[15]
            , (com.example.onecloudandroid.databinding.ProfileItemBinding) bindings[4]
            , (com.example.onecloudandroid.databinding.ProfileItemBinding) bindings[5]
            , (com.example.onecloudandroid.databinding.ProfileItemBinding) bindings[6]
            , (com.example.onecloudandroid.databinding.ProfileItem2Binding) bindings[7]
            , (com.example.onecloudandroid.databinding.ProfileItem2Binding) bindings[8]
            , (com.example.onecloudandroid.databinding.ProfileItem3Binding) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.view.View) bindings[3]
            , (android.widget.TextView) bindings[12]
            );
        setContainedBinding(this.item1);
        setContainedBinding(this.item2);
        setContainedBinding(this.item3);
        setContainedBinding(this.item4);
        setContainedBinding(this.item5);
        setContainedBinding(this.logout);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        item1.invalidateAll();
        item2.invalidateAll();
        item3.invalidateAll();
        item4.invalidateAll();
        item5.invalidateAll();
        logout.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (item1.hasPendingBindings()) {
            return true;
        }
        if (item2.hasPendingBindings()) {
            return true;
        }
        if (item3.hasPendingBindings()) {
            return true;
        }
        if (item4.hasPendingBindings()) {
            return true;
        }
        if (item5.hasPendingBindings()) {
            return true;
        }
        if (logout.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        item1.setLifecycleOwner(lifecycleOwner);
        item2.setLifecycleOwner(lifecycleOwner);
        item3.setLifecycleOwner(lifecycleOwner);
        item4.setLifecycleOwner(lifecycleOwner);
        item5.setLifecycleOwner(lifecycleOwner);
        logout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeItem1((com.example.onecloudandroid.databinding.ProfileItemBinding) object, fieldId);
            case 1 :
                return onChangeItem2((com.example.onecloudandroid.databinding.ProfileItemBinding) object, fieldId);
            case 2 :
                return onChangeItem5((com.example.onecloudandroid.databinding.ProfileItem2Binding) object, fieldId);
            case 3 :
                return onChangeLogout((com.example.onecloudandroid.databinding.ProfileItem3Binding) object, fieldId);
            case 4 :
                return onChangeItem3((com.example.onecloudandroid.databinding.ProfileItemBinding) object, fieldId);
            case 5 :
                return onChangeItem4((com.example.onecloudandroid.databinding.ProfileItem2Binding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeItem1(com.example.onecloudandroid.databinding.ProfileItemBinding Item1, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItem2(com.example.onecloudandroid.databinding.ProfileItemBinding Item2, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItem5(com.example.onecloudandroid.databinding.ProfileItem2Binding Item5, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLogout(com.example.onecloudandroid.databinding.ProfileItem3Binding Logout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItem3(com.example.onecloudandroid.databinding.ProfileItemBinding Item3, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeItem4(com.example.onecloudandroid.databinding.ProfileItem2Binding Item4, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
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
        // batch finished
        executeBindingsOn(item1);
        executeBindingsOn(item2);
        executeBindingsOn(item3);
        executeBindingsOn(item4);
        executeBindingsOn(item5);
        executeBindingsOn(logout);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item1
        flag 1 (0x2L): item2
        flag 2 (0x3L): item5
        flag 3 (0x4L): logout
        flag 4 (0x5L): item3
        flag 5 (0x6L): item4
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}