/*
 * Copyright 2021 Oliver Yasuna
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
 * 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this software without
 *      specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.oliveryasuna.vaadin.codeblock;

import com.oliveryasuna.vaadin.commons.component.descriptor.Descriptor;
import com.oliveryasuna.vaadin.commons.component.descriptor.Descriptors;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

/**
 * A component for displaying highlighted code.
 * <p>
 * Most <i>raw</i> implementation.
 *
 * @author Oliver Yasuna
 */
@Tag("code-block")
@JsModule("@oliveryasuna/code-block/code-block.js")
@NpmPackage(value = "@oliveryasuna/code-block", version = "1.0.2")
public class RawCodeBlock extends Component {

  private static final Descriptor<String, String> CODE_DESCRIPTOR = Descriptors.stringProperty("code");

  private static final Descriptor<String, String> LANGUAGE_DESCRIPTOR = Descriptors.stringAttribute("language");

  private static final Descriptor<String, String> THEME_DESCRIPTOR = Descriptors.stringAttribute("theme");

  private static final Descriptor<Boolean, Boolean> FANCY_DESCRIPTOR = Descriptors.booleanProperty("fancy", false);

  public RawCodeBlock() {
    super();
  }

  public String getLanguage() {
    return get(LANGUAGE_DESCRIPTOR);
  }

  public void setLanguage(final String language) {
    set(LANGUAGE_DESCRIPTOR, language);
  }

  public String getTheme() {
    return get(THEME_DESCRIPTOR);
  }

  public void setTheme(final String theme) {
    set(THEME_DESCRIPTOR, theme);
  }

  public String getCode() {
    return get(CODE_DESCRIPTOR);
  }

  public void setCode(final String code) {
    set(CODE_DESCRIPTOR, code);
  }

  public boolean isFancy() {
    return get(FANCY_DESCRIPTOR);
  }

  public void setFancy(final boolean fancy) {
    set(FANCY_DESCRIPTOR, fancy);
  }

}
