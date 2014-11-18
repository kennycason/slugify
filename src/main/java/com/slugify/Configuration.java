package com.slugify;

/**
 * Created by kenny on 11/18/14.
 */
public class Configuration {

    public static final Configuration DEFAULT_CONFIGURATION = new Configuration();

    private boolean preserveCase = false;

    private boolean toLowerCase = true;

    private boolean toUpperCase = false;

    // @datarank -> at-datarank
    private boolean atToText = true;

    // #datarank -> hashtag-datarank
    private boolean hashtagToText = true;

    // $data -> cash-data
    private boolean cashtagToText = true;

    // m&m -> m-and-m
    private boolean ampersandToText = true;

    // 5% -> 5-percent
    private boolean percentToText = true;

    public boolean isPreserveCase() {
        return preserveCase;
    }

    public void setPreserveCase(boolean preserveCase) {
        this.preserveCase = preserveCase;
        this.toUpperCase = false;
        this.toLowerCase = false;
    }

    public boolean isToLowerCase() {
        return toLowerCase;
    }

    public void setToLowerCase(boolean toLowerCase) {
        this.toLowerCase = toLowerCase;
        this.toUpperCase = !toLowerCase;
        this.preserveCase = false;
    }

    public boolean isToUpperCase() {
        return toUpperCase;
    }

    public void setToUpperCase(boolean toUpperCase) {
        this.toUpperCase = toUpperCase;
        this.toLowerCase = !toUpperCase;
        this.preserveCase = false;
    }

    public boolean isAtToText() {
        return atToText;
    }

    public void setAtToText(boolean atToText) {
        this.atToText = atToText;
    }

    public boolean isHashtagToText() {
        return hashtagToText;
    }

    public void setHashtagToText(boolean hashtagToText) {
        this.hashtagToText = hashtagToText;
    }

    public boolean isCashtagToText() {
        return cashtagToText;
    }

    public void setCashtagToText(boolean cashtagToText) {
        this.cashtagToText = cashtagToText;
    }

    public boolean isAmpersandToText() {
        return ampersandToText;
    }

    public void setAmpersandToText(boolean ampersandToText) {
        this.ampersandToText = ampersandToText;
    }

    public boolean isPercentToText() {
        return percentToText;
    }

    public void setPercentToText(boolean percentToText) {
        this.percentToText = percentToText;
    }

}
