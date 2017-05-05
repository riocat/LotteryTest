package com.yang.lotterytest.Service.impl;

import com.yang.lotterytest.Entity.User;
import com.yang.lotterytest.Service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGetUserByName() {
        User user = userService.getUserByName("Coolpad");
        if (user != null) {
            System.out.println(user.getEmail());
        }
    }

}
