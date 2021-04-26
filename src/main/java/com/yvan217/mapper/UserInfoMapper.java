package com.yvan217.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yvan217.entity.UserInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserInfoMapper extends BaseMapper<UserInfo> {
    /**
     * 查询所有
     * @return List<UserInfo>
     */
    @Select("SELEC * FROM userinfo")
    List<UserInfo> userInfoList();


}
