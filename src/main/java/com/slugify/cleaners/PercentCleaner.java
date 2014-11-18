package com.slugify.cleaners;

import com.slugify.Configuration;

import java.util.regex.Pattern;

/**
 * Created by kenny on 11/18/14.
 *
 * 5% -> 5-percent
 */
public class PercentCleaner implements Cleaner {
    private static final Pattern PERCENT_PATTERN = Pattern.compile("%");

    @Override
    public String apply(String text, Configuration configuration) {
        if(configuration.isPercentToText()) {
            return PERCENT_PATTERN.matcher(text).replaceAll("-percent-");
        }
        return text;
    }
}
