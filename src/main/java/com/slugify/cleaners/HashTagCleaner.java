package com.slugify.cleaners;

import com.slugify.Configuration;

import java.util.regex.Pattern;

/**
 * Created by kenny on 11/18/14.
 */
public class HashTagCleaner implements Cleaner {
    private static final Pattern HASHTAG_PATTERN = Pattern.compile("#");

    @Override
    public String apply(String text, Configuration configuration) {
        if(configuration.isHashtagToText()) {
            return HASHTAG_PATTERN.matcher(text).replaceAll("-hashtag-");
        }
        return text;
    }
}
