/*
 * Copyright (c) 2011 PonySDK
 *  Owners:
 *  Luciano Broussal  <luciano.broussal AT gmail.com>
 *	Mathieu Barbier   <mathieu.barbier AT gmail.com>
 *	Nicolas Ciaravola <nicolas.ciaravola.pro AT gmail.com>
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

package com.ponysdk.ui.server.addon;

import com.ponysdk.ui.server.basic.IsPWidget;
import com.ponysdk.ui.server.basic.PAddOn;
import com.ponysdk.ui.server.basic.PPopupPanel;
import com.ponysdk.ui.server.basic.PWidget;
import com.ponysdk.ui.terminal.PropertyKey;
import com.ponysdk.ui.terminal.WidgetType;
import com.ponysdk.ui.terminal.addon.attachedpopuppanel.PCAttachedPopupPanelAddon;

public class PAttachedPopupPanel extends PAddOn implements IsPWidget {

    private final PPopupPanel popupPanel;

    public PAttachedPopupPanel(final boolean autoHide, final PWidget attached) {
        popupPanel = new PPopupPanel(autoHide);
        create.getMainProperty().setProperty(PropertyKey.WIDGET, attached.getID());
    }

    @Override
    protected WidgetType getType() {
        return WidgetType.ADDON;
    }

    @Override
    public String getSignature() {
        return PCAttachedPopupPanelAddon.SIGNATURE;
    }

    @Override
    public PPopupPanel asWidget() {
        return popupPanel;
    }

}
