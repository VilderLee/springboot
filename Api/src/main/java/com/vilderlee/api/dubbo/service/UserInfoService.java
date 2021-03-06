package com.vilderlee.api.dubbo.service;

import com.vilderlee.api.dubbo.request.Request1000;
import com.vilderlee.api.dubbo.request.Request1001;
import com.vilderlee.api.dubbo.response.Response1000;
import com.vilderlee.api.dubbo.response.Response1001;

/**
 * <pre>
 * Modify Information:
 * Author       Date           Description
 * ============ ============= ============================
 * dell      2018/10/29        TODO
 * </pre>
 */
public interface UserInfoService {

    Response1000 tx1000(Request1000 request1000);

    Response1001 tx1001(Request1001 request1001);
}
