package com.slugify.cleaners;

import com.slugify.Configuration;

/**
 * Created by kenny on 11/18/14.
 */
public interface Cleaner {
    String apply(final String text, final Configuration configuration);
}
