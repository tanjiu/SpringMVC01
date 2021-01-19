package com.tanjiu.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @Description:
 * @Author: 叹久
 * @date 2021/1/19 21:56
 */
public class JsonUtils {

    //重载
    public  static  String getJson(Object object) throws JsonProcessingException {
        return getJson(object,"yyyy-MM-dd HH:mm:ss");
    }


    //object为要转化为json格式的对象，dateFormat为要转化的日期格式如"yyyy-MM-dd HH:mm:ss"
    public static String getJson(Object object,String dateFormat) throws JsonProcessingException {
        //jackson中的转化json函数
        ObjectMapper mapper=new ObjectMapper();

        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        //自定义日期的格式
        SimpleDateFormat sdf=new SimpleDateFormat(dateFormat);
        //将SimpleDateFormat转化后的日期格式定义为jackson的日期输出格式
        mapper.setDateFormat(sdf);
        //如果object不是时间类型的对象，则上面的设置不起作用，还是直接把Object对象转化为json串了
        return mapper.writeValueAsString(object);
    }
}
