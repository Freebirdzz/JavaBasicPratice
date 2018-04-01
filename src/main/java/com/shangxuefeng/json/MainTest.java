package com.shangxuefeng.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import javax.swing.text.Position;
import java.io.*;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

public class MainTest {
    public static Set<String> genderField = ImmutableSet.of("PassengerGender", "DriverGender");

    public static Map<String, String> genderConvert = ImmutableMap.of("男","1","女","2");

    public static void test(){
        String str = "{\"CompanyId\":\"33030009\",\"PassengerName\":\"我不想起名字。。\",\"State\":0,\"PassengerGender\":\"男\",\"UpdateTime\":20180308200701,\"RegisterDate\":20180308,\"PassengerPhone\":\"15722921560\",\"Flag\":1}";
        String message = "{\"CompanyId\":\"33030009\"," +
                "\"PassengerName\":\"Wbu554694568\"," +
                "\"State\":0," +
                "\"PassengerGender\":\"男\"," +
                "\"UpdateTime\":20180307142845," +
                "\"RegisterDate\":20180307," +
                "\"PassengerPhone\":\"13851723238\"," +
                "\"Flag\":1}";
        List<JSONObject> list = Lists.newArrayList();
        for (int i=0;i<500;i++){
            Map jsonObject = JSONObject.parseObject(message, Map.class);
            //如果不存在Address的字段，json对象中添加
            jsonObject.put("Address", "350100");
            //强制在请求体中设置CompanyId值
            jsonObject.put("CompanyId", "meituandache");
            //遍历可能的涉及性别的字段，将汉字的性别转换为数值形式
            for (String genderFieldName: MainTest.genderField){
                if (!Objects.isNull(jsonObject.get(genderFieldName))){
                    jsonObject.put(genderFieldName, MainTest.genderConvert.get(jsonObject.get(genderFieldName)));
                    System.out.println("*************i=" + i);
                }else{
                    System.out.println("--------------第" + i + "个消息---------------");
                    System.out.println("消息体：{}" +  message);
                    System.out.println("json对象：{}" + jsonObject.toString());
                }
            }

        }
        System.out.println(list.size());
//        for (int i=0;i<500;i++){
//            System.out.println(list.get(i));
//        }


    }
    public static void readJson(){
        List<String> list = new ArrayList<String>();
        try
        {
            String encoding = "GBK";
            File file = new File("baseInfoPassenger.json");
            if (file.isFile() && file.exists())
            { // 判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file), encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;

                while ((lineTxt = bufferedReader.readLine()) != null)
                {
                    list.add(lineTxt);
                }
                bufferedReader.close();
                read.close();
            }
            else
            {
                System.out.println("找不到指定的文件");
            }
        }
        catch (Exception e)
        {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        Set<String> phones = Sets.newHashSet();
        for (int i=0;i<list.size();i++){
            JSONObject json = JSONObject.parseObject(list.get(i));
            JSONArray array = (JSONArray)json.get("baseInfoPassenger");
            //System.out.println(array.size());
            for (int j=0;j<array.size();j++){
                String name = (String)((JSONObject)array.get(j)).get("PassengerPhone");
                if (phones.contains(name)){
                    System.out.println(name);
                }
                phones.add(name);
            }
        }
        System.out.println(phones.size());
    }
    public static void main(String[] args) {
        readJson();
    }
}