package com.slugify.cleaners;

import com.slugify.Configuration;

import java.util.regex.Pattern;

/**
 * Created by kenny on 11/18/14.
 *
 * @datarank -> at-datarank
 */
public class AtSymbolCleaner implements Cleaner {
    private static final Pattern AT_PATTERN = Pattern.compile("@");

    @Override
    public String apply(String text, Configuration configuration) {
        if(configuration.isAtToText()) {
            return AT_PATTERN.matcher(text).replaceAll("-at-");
        }
        return text;
    }
}
