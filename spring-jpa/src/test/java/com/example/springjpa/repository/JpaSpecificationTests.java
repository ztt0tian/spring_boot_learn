package com.example.springjpa.repository;

import com.example.springjpa.model.UserDetail;
import com.example.springjpa.param.UserDetailParam;
import com.example.springjpa.service.UserDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaSpecificationTests {
    @Resource
    private UserDetailService userDetailService;

    @Test
    public void testFindByCondition()  {
        int page=0,size=10;
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(page, size, sort);
        UserDetailParam param=new UserDetailParam();
        param.setIntroduction("一个爱玩的人");
        param.setMinAge(10);
        param.setMaxAge(30);
        param.setRealName("b");
        Page<UserDetail> page1=userDetailService.findByCondition(param,pageable);
        for (UserDetail userDetail:page1){
            System.out.println("userDetail: "+userDetail.toString());
        }
    }
}
