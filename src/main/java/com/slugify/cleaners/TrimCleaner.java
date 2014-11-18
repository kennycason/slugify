package com.slugify.cleaners;

import com.slugify.Configuration;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by kenny on 11/18/14.
 */
public class TrimCleaner implements Cleaner {
    @Override
    public String apply(String text, Configuration configuration) {
        return StringUtils.trimToEmpty(text).replaceAll("^[-]+|[-]+$", "");
    }
}
