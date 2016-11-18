package com.cx.core.utils;

import com.cx.sys.user.entity.User;
import com.sun.media.jfxmedia.logging.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.util.UUID;

/**
 * Created by cxspace on 16-11-18.
 */
public class ImageHelper {

    public static void saveHeadImg(File headImg , User user , String headImgFileName){

        try {

            //处理头像上传
            if (headImg != null){
                //1.保存头像文件到指定目录
                String filePath = ServletActionContext.getServletContext().getRealPath("upload/user");

                String fileName = UUID.randomUUID().toString().replaceAll("-","")+headImgFileName.substring(headImgFileName.lastIndexOf("."));

                FileUtils.copyFile(headImg,new File(filePath,fileName));

                //设置好数据库中要存储的图像路径
                user.setHead_img("user/"+fileName);

                System.out.println(fileName);
            }

        }catch (Exception e){

            e.printStackTrace();
        }

    }

}
