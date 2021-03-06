package com.vilderlee.api.dubbo.response;

import com.vilderlee.api.domain.UserInfo;
import com.vilderlee.common.dubbo.BaseResponse;

/**
 * <pre>
 * Modify Information:
 * Author       Date           Description
 * ============ ============= ============================
 * VilderLee      2018/10/26        TODO
 * </pre>
 */
public class Response1000 extends BaseResponse {

    private static final long serialVersionUID = -3147659417946422141L;

    private boolean isSuccess;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }
}
