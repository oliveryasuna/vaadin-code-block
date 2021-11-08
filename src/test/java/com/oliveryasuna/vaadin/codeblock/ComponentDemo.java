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

import com.oliveryasuna.vaadin.commons.component.AbstractComposite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public final class ComponentDemo extends AbstractComposite<VerticalLayout> {

  private static final String JS_SOURCE = "" +
      "function print(msg) {\n" +
      "  console.log(msg);\n" +
      "}\n" +
      "\n" +
      "print('Hello, World!');";

  private static final String JAVA_SOURCE = "" +
      "public void print(String msg) {\n" +
      "  System.out.println(msg);\n" +
      "}\n" +
      "\n" +
      "print(\"Hello, World!\");";

  @Override
  protected final VerticalLayout initContent() {
    final CodeBlock defaultCodeBlock = new CodeBlock(CodeBlock.Language.JAVASCRIPT, JS_SOURCE);
    final CodeBlock javaCodeBlock = new CodeBlock(CodeBlock.Language.JAVA, JAVA_SOURCE);
    final CodeBlock themedCodeBlock = new CodeBlock(CodeBlock.Language.JAVASCRIPT, CodeBlock.Theme.TOMORROW, JS_SOURCE);

    return new VerticalLayout(defaultCodeBlock, javaCodeBlock, themedCodeBlock);
  }

}
