package ren.yale.android.cachewebviewlib;

import android.text.TextUtils;

import java.util.HashSet;

/**
 * Created by yale on 2017/9/26.
 */

public class StaticRes {
    private static HashSet STATIC = new HashSet(){
        {
            add("html");
            add("js");
            add("css");
            add("png");
            add("jpg");
            add("jpeg");
            add("gif");
            add("bmp");
            add("ttf");
            add("woff");
            add("woff2");
            add("otf");
            add("eot");
            add("svg");
            add("xml");
            add("swf");
            add("txt");
            add("text");
            add("conf");
        }
    };

    public boolean canCache(String extension){

        if (TextUtils.isEmpty(extension)){
            return false;
        }
        return STATIC.contains(extension.toLowerCase().trim());

    }
    public void addExtension(String extension){
        if (TextUtils.isEmpty(extension)){
            return ;
        }
        extension = extension.replaceAll(".","");
        STATIC.add(extension.toLowerCase().trim());
    }
}