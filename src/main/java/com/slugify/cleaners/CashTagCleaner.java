package com.slugify.cleaners;

import com.slugify.Configuration;

import java.util.regex.Pattern;

/**
 * Created by kenny on 11/18/14.
 *
 * $data -> cash-data
 */
public class CashTagCleaner implements Cleaner {
    private static final Pattern CASHTAG_PATTERN = Pattern.compile("\\$");

    @Override
    public String apply(String text, Configuration configuration) {
        if(configuration.isCashtagToText()) {
            return CASHTAG_PATTERN.matcher(text).replaceAll("-cash-");
        }
        return text;
    }
}
