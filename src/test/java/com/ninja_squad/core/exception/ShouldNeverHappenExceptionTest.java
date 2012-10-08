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

package com.ninja_squad.core.exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShouldNeverHappenExceptionTest {
    @Test
    public void constructorsWork() {
        String defaultMessage = "Something that should never happen has happened.";
        assertEquals(defaultMessage, new ShouldNeverHappenException().getMessage());
        Throwable t = new Throwable();
        assertEquals(defaultMessage, new ShouldNeverHappenException(t).getMessage());
        assertSame(t, new ShouldNeverHappenException(t).getCause());
        String message = "testMessage";
        assertEquals(message, new ShouldNeverHappenException(message).getMessage());
        assertEquals(message, new ShouldNeverHappenException(message, t).getMessage());
        assertSame(t, new ShouldNeverHappenException(message, t).getCause());
    }
}
