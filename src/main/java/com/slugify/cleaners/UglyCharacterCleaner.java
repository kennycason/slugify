package com.slugify.cleaners;

import com.slugify.Configuration;

/**
 * Created by kenny on 11/18/14.
 */
public class UglyCharacterCleaner implements Cleaner {
    @Override
    public String apply(String text, Configuration configuration) {
        return text
                .replaceAll("[(?!\")\\p{Punct}|\\\\ \\-]+", "-")    // remove punctuation
                .replaceAll("!\\p{L}", "-");            // match all non Letters, handle latin/asian characters alike
    }
}
