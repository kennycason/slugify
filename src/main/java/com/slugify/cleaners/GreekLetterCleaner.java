package com.slugify.cleaners;

import com.slugify.Configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by kenny on 11/18/14.
 */
public class GreekLetterCleaner implements Cleaner {

    private static final Map<Pattern, String> GREEK_MAPPINGS = new HashMap<Pattern, String>() {{
            put(Pattern.compile("Α|α"), "-alpha-");
            put(Pattern.compile("Β|β"), "-beta-");
            put(Pattern.compile("Γ|γ"), "-gamma-");
            put(Pattern.compile("Δ|δ"), "-delta-");
            put(Pattern.compile("Ε|ε"), "-epsilon-");
            put(Pattern.compile("Ζ|ζ"), "-zeta-");
            put(Pattern.compile("Η|η"), "-eta-");
            put(Pattern.compile("Θ|θ"), "-theta-");
            put(Pattern.compile("Ι|ι"), "-iota-");
            put(Pattern.compile("Κ|κ"), "-kappa-");
            put(Pattern.compile("Λ|λ"), "-lambda-");
            put(Pattern.compile("Μ|μ"), "-mu-");
            put(Pattern.compile("Ν|ν"), "-nu-");
            put(Pattern.compile("Ξ|ξ"), "-xi-");
            put(Pattern.compile("Ο|ο"), "-omicron-");
            put(Pattern.compile("Π|π"), "-pi-");
            put(Pattern.compile("Ρ|ρ"), "-rho-");
            put(Pattern.compile("Σ|σ|ς"), "-sigma-");
            put(Pattern.compile("Τ|τ"), "-tau-");
            put(Pattern.compile("Υ|υ"), "-upsilon-");
            put(Pattern.compile("Φ|φ"), "-phi-");
            put(Pattern.compile("Χ|χ"), "-chi-");
            put(Pattern.compile("Ψ|ψ"), "-psi-");
            put(Pattern.compile("Ω|ω"), "-omega-");
    }};

    @Override
    public String apply(String text, Configuration configuration) {
        String slug = text;
        if(configuration.isGreekToText()) {
            for(Map.Entry<Pattern, String> patternReplaceEntry : GREEK_MAPPINGS.entrySet()) {
                final Pattern pattern = patternReplaceEntry.getKey();
                final String replacement = patternReplaceEntry.getValue();
                slug = pattern.matcher(slug).replaceAll(replacement);
            }
        }
        return slug;
    }
}
