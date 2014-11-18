package com.slugify;

/**
 * Created by kenny on 11/18/14.
 */
public class Configuration {

    public static final Configuration DEFAULT_CONFIGURATION = new Configuration();

    private boolean preserveCase = false;

    private boolean toLowerCase = true;

    private boolean toUpperCase = false;

    private boolean atToText = true;

    private boolean hashtagToText = true;

    private boolean cashtagToText = true;

    private boolean ampersandToText = true;

    private boolean percentToText = true;

    private boolean greekToText = true;

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

    public boolean isGreekToText() {
        return greekToText;
    }

    public void setGreekToText(boolean greekToText) {
        this.greekToText = greekToText;
    }
}
