package com.esperia09.rssnewsbook.utils;

/**
 * Created by esperia on 2016/06/20.
 */
public class TextUtils {

    /**
     * Returns true if the string is null or 0-length.
     *
     * @param str the string to be examined
     * @return true if str is null or zero length
     */
    public static boolean isEmpty(CharSequence str) {
        if (str == null || str.length() == 0)
            return true;
        else
            return false;
    }
}
