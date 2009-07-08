/*
 * Copyright 2009 Fred Sauer
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
package com.allen_sauer.gwt.log.client;

import com.google.gwt.user.client.ui.Widget;

// CHECKSTYLE_JAVADOC_OFF
public class DivLogger extends AbstractLogger {
  public Widget getWidget() {
    throw new UnsupportedOperationException();
  }

  public boolean isVisible() {
    throw new UnsupportedOperationException();
  }

  public void moveTo(int x, int y) {
    throw new UnsupportedOperationException();
  }

  public void setPixelSize(int width, int height) {
    throw new UnsupportedOperationException();
  }

  public void setSize(String width, String height) {
    throw new UnsupportedOperationException();
  }
}