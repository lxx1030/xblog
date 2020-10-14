package com.yx1030.client.controller;

import com.yx1030.client.config.HttpclientConfig;
import com.yx1030.client.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.concurrent.CountDownLatch;

@Controller
@RequestMapping("userClient")
public class UserClient  {
    private static final String REST_URL_PREFIX = "http://localhost:8081/";
    @Resource
    RestTemplate restTemplate;

    @RequestMapping("/getUserById")
    @ResponseBody
    public Object getUserById( Integer id){
        return restTemplate.getForObject(REST_URL_PREFIX+"user/getUserById?id="+id, User.class);

    }

    public static void main(String[] args) {
        UserClient userClient = new UserClient();
        /*CountDownLatch countDownLatch;
        countDownLatch = new CountDownLatch(1);*/
        for (int i = 0; i < 500; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    userClient.getUserById(1);
                }
            });

        }
        /*try {
            countDownLatch.await();
        } catch (InterruptedException e) {


        }*/
    }







}
