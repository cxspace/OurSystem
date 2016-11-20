package com.cx.core.utils;

/**
 * Created by cxspace on 16-11-18.
 */
public class RandomCodeUtils {

    public static String getRadomCode(int length){

        String code = "";

        for (int i = 0 ; i < length ; i++)
        {
             int a = (int)(10*Math.random());
             code += a;
        }
        return code;
    }

}
