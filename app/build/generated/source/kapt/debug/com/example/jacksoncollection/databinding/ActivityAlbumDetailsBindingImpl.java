package com.example.jacksoncollection.databinding;
import com.example.jacksoncollection.R;
import com.example.jacksoncollection.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAlbumDetailsBindingImpl extends ActivityAlbumDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 10);
        sViewsWithIds.put(R.id.divider, 11);
        sViewsWithIds.put(R.id.collectionNameText, 12);
        sViewsWithIds.put(R.id.trackNameText, 13);
        sViewsWithIds.put(R.id.trackTimeText, 14);
        sViewsWithIds.put(R.id.releaseDateText, 15);
        sViewsWithIds.put(R.id.trackPriceText, 16);
        sViewsWithIds.put(R.id.countryText, 17);
        sViewsWithIds.put(R.id.currencyText, 18);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAlbumDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityAlbumDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[18]
            , (android.view.View) bindings[11]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[15]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[10]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[14]
            );
        this.albumCover.setTag(null);
        this.artistName.setTag(null);
        this.collectionName.setTag(null);
        this.copyRight.setTag(null);
        this.country.setTag(null);
        this.currency.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.releaseDate.setTag(null);
        this.trackName.setTag(null);
        this.trackTime.setTag(null);
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
        java.lang.String modelTrackName = null;
        java.lang.String modelCollectionName = null;
        java.lang.String modelArtworkUrl100 = null;
        int androidxDatabindingViewDataBindingSafeUnboxModelTrackTimeMillis = 0;
        java.lang.Integer modelTrackTimeMillis = null;
        java.lang.String modelTrackPriceJavaLangString = null;
        java.lang.String modelArtistName = null;
        java.lang.String modelCountry = null;
        java.lang.String modelReleaseDate = null;
        java.lang.Double modelTrackPrice = null;
        java.lang.String modelCurrency = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.trackName
                    modelTrackName = model.getTrackName();
                    // read model.collectionName
                    modelCollectionName = model.getCollectionName();
                    // read model.artworkUrl100
                    modelArtworkUrl100 = model.getArtworkUrl100();
                    // read model.trackTimeMillis
                    modelTrackTimeMillis = model.getTrackTimeMillis();
                    // read model.artistName
                    modelArtistName = model.getArtistName();
                    // read model.country
                    modelCountry = model.getCountry();
                    // read model.releaseDate
                    modelReleaseDate = model.getReleaseDate();
                    // read model.trackPrice
                    modelTrackPrice = model.getTrackPrice();
                    // read model.currency
                    modelCurrency = model.getCurrency();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(model.trackTimeMillis)
                androidxDatabindingViewDataBindingSafeUnboxModelTrackTimeMillis = androidx.databinding.ViewDataBinding.safeUnbox(modelTrackTimeMillis);
                // read (model.trackPrice) + ("")
                modelTrackPriceJavaLangString = (modelTrackPrice) + ("");
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.jacksoncollection.base.glide.ImageLoaderKt.loadImage(this.albumCover, modelArtworkUrl100);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.artistName, modelArtistName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.collectionName, modelCollectionName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.copyRight, modelTrackPriceJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.country, modelCountry);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.currency, modelCurrency);
            com.example.jacksoncollection.extensions.AppExtensionKt.setFormattedDate(this.releaseDate, modelReleaseDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.trackName, modelTrackName);
            com.example.jacksoncollection.extensions.AppExtensionKt.setConvertedTime(this.trackTime, androidxDatabindingViewDataBindingSafeUnboxModelTrackTimeMillis);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}