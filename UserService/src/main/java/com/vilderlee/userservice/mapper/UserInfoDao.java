package com.vilderlee.userservice.mapper;

import com.vilderlee.api.domain.UserInfo;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

/**
 * <pre>
 * Modify Information:
 * Author       Date           Description
 * ============ ============= ============================
 * VilderLee      2018/10/29        TODO
 * </pre>
 */
public interface UserInfoDao {

    @Cacheable(value="oo",key = "#userId")
    UserInfo getUserInfo(String userId);

    @CachePut(key = "#userInfo.userId")
    void insertUserInfo(UserInfo userInfo);
}
