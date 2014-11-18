package com.slugify;

import com.slugify.cleaners.AmpersandCleaner;
import com.slugify.cleaners.AtSymbolCleaner;
import com.slugify.cleaners.CaseCleaner;
import com.slugify.cleaners.CashTagCleaner;
import com.slugify.cleaners.Cleaner;
import com.slugify.cleaners.GreekLetterCleaner;
import com.slugify.cleaners.HashTagCleaner;
import com.slugify.cleaners.PercentCleaner;
import com.slugify.cleaners.TrimCleaner;
import com.slugify.cleaners.UglyCharacterCleaner;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kenny on 11/18/14.
 */
public class Slugify {

    private static final List<Cleaner> CLEANERS = Arrays.asList(
            new HashTagCleaner(),
            new AmpersandCleaner(),
            new AtSymbolCleaner(),
            new CashTagCleaner(),
            new PercentCleaner(),
            new GreekLetterCleaner(),
            new CaseCleaner(),
            new UglyCharacterCleaner(),
            new TrimCleaner()
    );

    private final Configuration configuration;

    public Slugify() {
        this(Configuration.DEFAULT_CONFIGURATION);
    }

    public Slugify(Configuration configuration) {
        this.configuration = configuration;
    }

    public String slugify(final String text) {
        if(StringUtils.isBlank(text)) { return ""; }

        String slug = text;
        for(Cleaner cleaner : CLEANERS) {
            slug = cleaner.apply(slug, configuration);
        }

        return slug;
    }

}
