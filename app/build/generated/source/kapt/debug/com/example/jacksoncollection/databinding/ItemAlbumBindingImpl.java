package com.example.jacksoncollection.databinding;
import com.example.jacksoncollection.R;
import com.example.jacksoncollection.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAlbumBindingImpl extends ItemAlbumBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mModelOnItemClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemAlbumBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemAlbumBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.albumCover.setTag(null);
        this.artistName.setTag(null);
        this.collectionName.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.model == variableId) {
            setModel((com.example.jacksoncollection.base.domain.response.Album) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.example.jacksoncollection.base.domain.response.Album Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
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
        com.example.jacksoncollection.base.domain.response.Album model = mModel;
        java.lang.String modelCollectionName = null;
        java.lang.String modelArtistName = null;
        java.lang.String modelArtworkUrl100 = null;
        android.view.View.OnClickListener modelOnItemClickAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.collectionName
                    modelCollectionName = model.getCollectionName();
                    // read model.artistName
                    modelArtistName = model.getArtistName();
                    // read model.artworkUrl100
                    modelArtworkUrl100 = model.getArtworkUrl100();
                    // read model::onItemClick
                    modelOnItemClickAndroidViewViewOnClickListener = (((mModelOnItemClickAndroidViewViewOnClickListener == null) ? (mModelOnItemClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mModelOnItemClickAndroidViewViewOnClickListener).setValue(model));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.jacksoncollection.base.glide.ImageLoaderKt.loadImage(this.albumCover, modelArtworkUrl100);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.artistName, modelArtistName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.collectionName, modelCollectionName);
            this.mboundView0.setOnClickListener(modelOnItemClickAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.jacksoncollection.base.domain.response.Album value;
        public OnClickListenerImpl setValue(com.example.jacksoncollection.base.domain.response.Album value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onItemClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}