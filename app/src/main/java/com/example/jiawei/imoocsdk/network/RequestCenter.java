package com.example.jiawei.imoocsdk.network;

import com.example.jiawei.imoocsdk.module.recommand.RecommandModel;
import com.example.sdk.okhttp.CommonOkHttpClient;
import com.example.sdk.okhttp.listener.DisposeDataHandle;
import com.example.sdk.okhttp.listener.DisposeDataListener;
import com.example.sdk.okhttp.request.CommonRequest;
import com.example.sdk.okhttp.request.RequestParams;

/**
 * Created by jiawei on 2017/3/22.
 */

public class RequestCenter {

    //根据参数发送所有post请求
    public static void postRequest(String url, RequestParams params, DisposeDataListener listener, Class<?> clazz) {
        CommonOkHttpClient.get(CommonRequest.
                createGetRequest(url, params), new DisposeDataHandle(listener, clazz));
    }

    public static void requestRecommandData(DisposeDataListener listener) {
        RequestCenter.postRequest(HttpConstants.HOME_RECOMMAND, null, listener, RecommandModel.class);
    }


}
