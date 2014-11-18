package com.slugify.cleaners;

import com.slugify.Configuration;

/**
 * Created by kenny on 11/18/14.
 */
public class CaseCleaner implements Cleaner {
    @Override
    public String apply(String text, Configuration configuration) {
        if(configuration.isToLowerCase()) {
            return text.toLowerCase();
        }
        if(configuration.isToUpperCase()) {
            return text.toUpperCase();
        }
        return text;
    }
}
