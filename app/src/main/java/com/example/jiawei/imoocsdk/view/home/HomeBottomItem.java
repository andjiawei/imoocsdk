package com.example.jiawei.imoocsdk.view.home;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiawei.imoocsdk.R;
import com.example.jiawei.imoocsdk.module.recommand.RecommandModel;

import adutils.ImageLoaderUtil;


/**
 * @author: vision
 * @function:
 * @date: 16/9/2
 */
public class HomeBottomItem extends RelativeLayout {

    private Context mContext;
    /**
     * UI
     */
    private RelativeLayout mRootView;
    private TextView mTitleView;
    private TextView mInfoView;
    private TextView mInterestingView;
    private ImageView mImageOneView;
    private ImageView mImageTwoView;

    /**
     * Data
     */
    private RecommandModel.DataBean.HeadBean.FooterBean mData;
    private ImageLoaderUtil mImageLoader;

    public HomeBottomItem(Context context, RecommandModel.DataBean.HeadBean.FooterBean data) {
        this(context, null, data);
    }

    public HomeBottomItem(Context context, AttributeSet attrs, RecommandModel.DataBean.HeadBean.FooterBean data) {
        super(context, attrs);
        mContext = context;
        mData = data;
        mImageLoader = ImageLoaderUtil.getInstance(mContext);
        initView();
    }

    private void initView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        mRootView = (RelativeLayout) inflater.inflate(R.layout.item_home_recommand_layout, this); //添加到当前布局中
        mTitleView = (TextView) mRootView.findViewById(R.id.title_view);
        mInfoView = (TextView) mRootView.findViewById(R.id.info_view);
        mInterestingView = (TextView) mRootView.findViewById(R.id.interesting_view);
        mImageOneView = (ImageView) mRootView.findViewById(R.id.icon_1);
        mImageTwoView = (ImageView) mRootView.findViewById(R.id.icon_2);
        mRootView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(mContext, AdBrowserActivity.class);
//                intent.putExtra(AdBrowserActivity.KEY_URL, mData.destationUrl);
//                mContext.startActivity(intent);
            }
        });
        mTitleView.setText(mData.getTitle());
        mInfoView.setText(mData.getInfo());
        mInterestingView.setText(mData.getFrom());
        mImageLoader.displayImage(mImageOneView, mData.getImageOne());
        mImageLoader.displayImage(mImageTwoView, mData.getImageTwo());
    }
}
