package com.student.util;

import java.math.BigInteger;

public class SequenceGeneratorUtil {

    //STU<NUMBER> -> Random Id
    public static String generateAltKey() {
        return "STU" + (100 + Math.random() * (Integer.MAX_VALUE));
    }

}
