/*
 * Copyright (c) 2011 PonySDK
 *  Owners:
 *  Luciano Broussal  <luciano.broussal AT gmail.com>
 *  Mathieu Barbier   <mathieu.barbier AT gmail.com>
 *  Nicolas Ciaravola <nicolas.ciaravola.pro AT gmail.com>
 *  
 *  WebSite:
 *  http://code.google.com/p/pony-sdk/
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.ponysdk.ui.server.basic;

import com.ponysdk.core.tools.Objects;
import com.ponysdk.ui.server.basic.event.PHasHTML;
import com.ponysdk.ui.terminal.Dictionnary.PROPERTY;
import com.ponysdk.ui.terminal.WidgetType;

/**
 * A widget that represents a simple &lt;a&gt; element. <h3>CSS Style Rules</h3>
 * <ul class='css'>
 * <li>.gwt-Anchor { }</li>
 * </ul>
 */
public class PAnchor extends PFocusWidget implements PHasHTML {

    private String text;
    private String html;
    private String href;

    /**
     * Creates an anchor with its text specified.
     * 
     * @param text
     *            the anchor's text
     */
    public PAnchor(final String text) {
        setText(text);
    }

    public PAnchor() {
        this("");
    }

    /**
     * Creates an anchor with its text and href (target URL) specified.
     * 
     * @param text
     *            the anchor's text
     * @param href
     *            the url to which it will link
     */
    public PAnchor(final String text, final String href) {
        this(text);
        setHref(href);
    }

    @Override
    protected WidgetType getWidgetType() {
        return WidgetType.ANCHOR;
    }

    /**
     * Gets the anchor's href (the url to which it links).
     * 
     * @return the anchor's href
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the anchor's href (the url to which it links).
     * 
     * @param href
     *            the anchor's href
     */
    public void setHref(final String href) {
        if (Objects.equals(this.href, href)) return;
        this.href = href;
        saveUpdate(PROPERTY.HREF, this.href);
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(final String text) {
        if (Objects.equals(this.text, text)) return;

        this.text = text;
        saveUpdate(PROPERTY.TEXT, this.text);
    }

    @Override
    public String getHTML() {
        return html;
    }

    @Override
    public void setHTML(final String html) {
        if (Objects.equals(this.html, html)) return;

        this.html = html;
        saveUpdate(PROPERTY.HTML, this.html);
    }

}
