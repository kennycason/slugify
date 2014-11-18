package com.slugify;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kenny on 11/18/14.
 */
public class TestSlugify {

    @Test
    public void defaultTests() {
        final Slugify slugify = new Slugify();
        assertEquals("hashtag-nintendo", slugify.slugify("#nintendo"));
        assertEquals("nintendo-64", slugify.slugify("Nintendo 64"));
        assertEquals("m-and-m", slugify.slugify("M&M"));
        assertEquals("1-dash", slugify.slugify("1        DASH"));
        assertEquals("1-dash", slugify.slugify("1        DASH"));
        assertEquals("1-slash", slugify.slugify("1//slash"));
        assertEquals("dashes", slugify.slugify("---dashes---"));
        assertEquals("任天堂", slugify.slugify("---任天堂---"));
        assertEquals("double-dash", slugify.slugify("double--dash"));
        assertEquals("hashtag-food-at-hashtag-cash-percent-and", slugify.slugify("---#food!@#$%&*()---"));
    }

}
