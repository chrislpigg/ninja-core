/*
 * The MIT License
 *
 * Copyright (c) 2012, Ninja Squad
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.ninja_squad.core.i18n;

import java.util.MissingResourceException;

/**
 * Instances of {@link MissingResourceStrategy}
 *
 * @author JB Nizet
 */
public final class MissingResourceStrategies {

    /**
     * A {@link MissingResourceStrategy} consisting in returning <code>null</code> when
     * the resource is missing
     */
    public static final MissingResourceStrategy RETURN_NULL = new MissingResourceStrategy() {
        @Override
        public String handleMissingResource(String key, MissingResourceException e) {
            return null;
        }
    };

    /**
     * A {@link MissingResourceStrategy} consisting in returning mimicking the behavior of the
     * JSTL when the resource is missing: returning the key surrounded with <code>???</code>
     */
    public static final MissingResourceStrategy JSTL = new MissingResourceStrategy() {
        @Override
        public String handleMissingResource(String key, MissingResourceException e) {
            return "???" + key + "???";
        }
    };

    /**
     * A {@link MissingResourceStrategy} consisting in throwing an IllegalStateException when
     * the resource is missing. This is the default strategy.
     */
    public static final MissingResourceStrategy THROW_EXCEPTION = new MissingResourceStrategy() {
        @Override
        public String handleMissingResource(String key, MissingResourceException e) {
            throw new IllegalStateException("Impossible to find the value for the key " + key, e);
        }
    };

    /**
     * A {@link MissingResourceStrategy} consisting in returning the key when the resource is missing.
     */
    public static final MissingResourceStrategy RETURN_KEY = new MissingResourceStrategy() {
        @Override
        public String handleMissingResource(String key, MissingResourceException e) {
            return key;
        }
    };

    private MissingResourceStrategies() {
    }
}