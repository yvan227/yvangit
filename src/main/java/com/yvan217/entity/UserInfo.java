package com.yvan217.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("userinfo")
public class UserInfo {

    private Integer UserInfoOid;
    private String NickName;
    private String UserName;
    private Integer REVISION;
    private String CREATED_BY;
    private Date CREATED_TIME;
    private String UPDATED_BY;
    private Date UPDATED_TIME;

    public UserInfo(Integer UserInfoOid,String NickName,String UserName){

        this.UserInfoOid = UserInfoOid;
        this.NickName = NickName;
        this.UserName = UserName;
    }

}