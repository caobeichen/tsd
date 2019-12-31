package com.lushe.tsd.core.utils;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author lushe
 * @date 2019/12/31 2:04 PM
 * @Des:
 **/
public class GenerateUtils {

    /**
     * 生成分支号
     *
     * @return
     */
    private static String generateBranchTags() {
        return RandomStringUtils.randomAlphanumeric(8);
    }


    public static void main(String[] args) {
        System.out.println(generateBranchTags());
    }
}
