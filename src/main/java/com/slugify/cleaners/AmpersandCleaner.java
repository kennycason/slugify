package com.slugify.cleaners;

import com.slugify.Configuration;

import java.util.regex.Pattern;

/**
 * Created by kenny on 11/18/14.
 */
public class AmpersandCleaner implements Cleaner {
    private static final Pattern AMPERSAND_PATTERN = Pattern.compile("&");

    @Override
    public String apply(String text, Configuration configuration) {
        if(configuration.isAmpersandToText()) {
            return AMPERSAND_PATTERN.matcher(text).replaceAll("-and-");
        }
        return text;
    }
}
