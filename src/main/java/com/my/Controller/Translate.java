package com.my.Controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.my.server.TranslateInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Translate {

    @Resource
    private TranslateInterface translateInterface;



    /**
     * 简体转换繁体
     * @param orgin
     * @return
     */
    @RequestMapping(value = "/cntotc", method = {RequestMethod.GET,RequestMethod.POST},produces = "application/json;charset=UTF-8")
    public String cntotc(String orgin) {
        String error="{"+"result"+":"+"转换失败"+","+"stat"+":"+"1"+"}";
        Map<String,String> map = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        String result=translateInterface.CNTOTC(orgin);
        map.put("result",result);
        map.put("message","成功");
        map.put("stat","0");

        try {
            String json =mapper.writeValueAsString(map);
            if (json.isEmpty())
            {
                System.out.println(error);
                return error;

            }
            else {
                System.out.println(json);
                return json;
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(error);
        return error;
    }


    /**
     * 简体转繁体简易返回值
     * @param orgin
     * @return
     */
    @RequestMapping(value = "/cntotcsimple",method = {RequestMethod.GET,RequestMethod.POST}, produces = "application/json;charset=UTF-8")
    public String cntotcsimple(String orgin) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(translateInterface.CNTOTC(orgin));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "转换失败";
    }

    /**
     * 繁体转换简体
     * @param orgin
     * @return
     */
    @RequestMapping(value = "/tctocn", method = {RequestMethod.GET,RequestMethod.POST}, produces = "application/json;charset=UTF-8")
    public String tctocn(String orgin) {
        String error="{"+"result"+":"+"轉換失敗"+","+"stat"+":"+"1"+"}";
        Map<String,String> map = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        String result=translateInterface.TCTOCN(orgin);
        map.put("result",result);
        map.put("message","成功");
        map.put("stat","0");

        try {
            return mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return error;
    }


    /**
     * 繁体转换简体简易返回值
     * @param orgin
     * @return
     */

    @RequestMapping(value = "/tctocnsimple", method = {RequestMethod.GET,RequestMethod.POST}, produces = "application/json;charset=UTF-8")
    public String tctocnsimple(String orgin) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(translateInterface.TCTOCN(orgin));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "轉換失敗";
    }


}
