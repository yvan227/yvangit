package com.yvan217.controller;

import com.yvan217.entity.UserInfo;
import com.yvan217.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @RequestMapping("/userInfoList")
    public List<UserInfo> userInfoList(){
        return userInfoMapper.userInfoList();
    }

    @RequestMapping("/insertuserInfo")
    public String insertuserInfo(){
        for (int i = 1; i < 10; i++){
            UserInfo userInfo = new UserInfo(i,"yvan217" +i ,"yvan217" +i ) ;

            try {
                userInfoMapper.insert(userInfo);
            }catch (Exception e){
                System.out.println("i"+e.getMessage());
            }

        }
        return "success";
    }
}
