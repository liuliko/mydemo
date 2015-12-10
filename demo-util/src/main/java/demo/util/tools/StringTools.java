package net.hunanst.common.util.tools;

/**
 * Created by liuli on 2015/7/13.
 */

public class StringTools {

    //把字符串转成 unicode 编码
    public static String string2Unicode(String string) {
        StringBuffer unicode = new StringBuffer();
        for (int i = 0; i < string.length(); i++) {
            // 取出每一个字符
            char c = string.charAt(i);
            // 转换为unicode
            unicode.append("\\u" + Integer.toHexString(c));
        }
        return unicode.toString();
    }

    public static String stringRegx(String str) {
        str=str.replaceAll("\"", "'");
        return str;
    }
    public  static  String subString(String str,int length){
        if(str.length()<=length){
            return  str;
        }else{
            return  str.substring(0,length)+"...";
        }
    }


}
