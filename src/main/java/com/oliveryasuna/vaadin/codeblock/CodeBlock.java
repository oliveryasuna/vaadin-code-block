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

import org.apache.commons.lang3.EnumUtils;

/**
 * A component for displaying highlighted code.
 * <p>
 * Developer friendly extension of {@link RawCodeBlock}.
 *
 * @author Oliver Yasuna
 */
public class CodeBlock extends RawCodeBlock {

  public CodeBlock(final Language language) {
    super();

    setLanguage(language);
  }

  public CodeBlock(final Language language, final String code) {
    this(language);

    setCode(code);
  }

  public CodeBlock(final Language language, final Theme theme) {
    this(language);

    setTheme(theme);
  }

  public CodeBlock(final Language language, final Theme theme, final String code) {
    this(language, theme);

    setCode(code);
  }

  public Language getLanguageObj() {
    return EnumUtils.getEnumIgnoreCase(Language.class, getLanguage());
  }

  public void setLanguage(final Language language) {
    setLanguage(language.getName());
  }

  public Theme getThemeObj() {
    return EnumUtils.getEnum(Theme.class, getTheme());
  }

  public void setTheme(final Theme theme) {
    setTheme(theme.getPath());
  }

  /**
   * The languages supported by prism.
   *
   * @author Oliver Yasuna
   * @see <a href="https://github.com/PrismJS/prism/tree/v1.17.1/components">https://github.com/PrismJS/prism/tree/v1.17.1/components</a>
   */
  public enum Language {

    ABAP("abap"),

    ABNF("abnf"),

    ACTIONSCRIPT("actionscript"),

    ADA("ada"),

    APACHECONF("apacheconf"),

    APL("apl"),

    APPLESCRIPT("applescript"),

    ARDUINO("arduino"),

    ARFF("arff"),

    ASCIIDOC("asciidoc"),

    ASM6502("asm6502"),

    ASPNET("aspnet"),

    AUTOHOTKEY("autohotkey"),

    AUTOIT("autoit"),

    BASH("bash"),

    BASIC("basic"),

    BATCH("batch"),

    BISON("bison"),

    BNF("bnf"),

    BRAINFUCK("brainfuck"),

    BRO("bro"),

    C("c"),

    CIL("cil"),

    CLIKE("clike"),

    CLOJURE("clojure"),

    CMAKE("cmake"),

    COFFEESCRIPT("coffeescript"),

    CORE("core"),

    CPP("cpp"),

    CRYSTAL("crystal"),

    CSHARP("csharp"),

    CSP("csp"),

    CSS_EXTRAS("css-extras"),

    CSS("css"),

    D("d"),

    DART("dart"),

    DIFF("diff"),

    DJANGO("django"),

    DNS_ZONE_FILE("dns-zone-file"),

    DOCKER("docker"),

    EBNF("ebnf"),

    EIFFEL("eiffel"),

    EJS("ejs"),

    ELIXIR("elixir"),

    ELM("elm"),

    ERB("erb"),

    ERLANG("erlang"),

    FLOW("flow"),

    FORTRAN("fortran"),

    FSHARP("fsharp"),

    GCODE("gcode"),

    GEDCOM("gedcom"),

    GHERKIN("gherkin"),

    GIT("git"),

    GLSL("glsl"),

    GML("gml"),

    GO("go"),

    GRAPHQL("graphql"),

    GROOVY("groovy"),

    HAML("haml"),

    HANDLEBARS("handlebars"),

    HASKELL("haskell"),

    HAXE("haxe"),

    HCL("hcl"),

    HPKP("hpkp"),

    HSTS("hsts"),

    HTTP("http"),

    ICHIGOJAM("ichigojam"),

    ICON("icon"),

    INFORM7("inform7"),

    INI("ini"),

    IO("io"),

    J("j"),

    JAVA("java"),

    JAVADOC("javadoc"),

    JAVADOCLIKE("javadoclike"),

    JAVASCRIPT("javascript"),

    JAVASTACKTRACE("javastacktrace"),

    JOLIE("jolie"),

    JQ("jq"),

    JS_EXTRAS("js-extras"),

    JS_TEMPLATES("js-templates"),

    JSDOC("jsdoc"),

    JSON("json"),

    JSON5("json5"),

    JSONP("jsonp"),

    JSX("jsx"),

    JULIA("julia"),

    KEYMAN("keyman"),

    KOTLIN("kotlin"),

    LATEX("latex"),

    LESS("less"),

    LILYPOND("lilypond"),

    LIQUID("liquid"),

    LISP("lisp"),

    LIVESCRIPT("livescript"),

    LOLCODE("lolcode"),

    LUA("lua"),

    MAKEFILE("makefile"),

    MARKDOWN("markdown"),

    MARKUP_TEMPLATING("markup-templating"),

    MARKUP("markup"),

    MATLAB("matlab"),

    MEL("mel"),

    MIZAR("mizar"),

    MONKEY("monkey"),

    N1QL("n1ql"),

    N4JS("n4js"),

    NAND2TETRIS_HDL("nand2tetris-hdl"),

    NASM("nasm"),

    NGINX("nginx"),

    NIM("nim"),

    NIX("nix"),

    NSIS("nsis"),

    OBJECTIVEC("objectivec"),

    OCAML("ocaml"),

    OPENCL("opencl"),

    OZ("oz"),

    PARIGP("parigp"),

    PARSER("parser"),

    PASCAL("pascal"),

    PASCALIGO("pascaligo"),

    PCAXIS("pcaxis"),

    PERL("perl"),

    PHP_EXTRAS("php-extras"),

    PHP("php"),

    PHPDOC("phpdoc"),

    PLSQL("plsql"),

    POWERSHELL("powershell"),

    PROCESSING("processing"),

    PROLOG("prolog"),

    PROPERTIES("properties"),

    PROTOBUF("protobuf"),

    PUG("pug"),

    PUPPET("puppet"),

    PURE("pure"),

    PYTHON("python"),

    Q("q"),

    QORE("qore"),

    R("r"),

    REASON("reason"),

    REGEX("regex"),

    RENPY("renpy"),

    REST("rest"),

    RIP("rip"),

    ROBOCONF("roboconf"),

    RUBY("ruby"),

    RUST("rust"),

    SAS("sas"),

    SASS("sass"),

    SCALA("scala"),

    SCHEME("scheme"),

    SCSS("scss"),

    SHELL_SESSION("shell-session"),

    SMALLTALK("smalltalk"),

    SMARTY("smarty"),

    SOY("soy"),

    SPLUNK_SPL("splunk-spl"),

    SQL("sql"),

    STYLUS("stylus"),

    SWIFT("swift"),

    T4_CS("t4-cs"),

    T4_TEMPLATING("t4-templating"),

    T4_VB("t4-vb"),

    TAP("tap"),

    TCL("tcl"),

    TEXTILE("textile"),

    TOML("toml"),

    TSX("tsx"),

    TT2("tt2"),

    TWIG("twig"),

    TYPESCRIPT("typescript"),

    VALA("vala"),

    VBNET("vbnet"),

    VELOCITY("velocity"),

    VERILOG("verilog"),

    VHDL("vhdl"),

    VIM("vim"),

    VISUAL_BASIC("visual-basic"),

    WASM("wasm"),

    WIKI("wiki"),

    XEORA("xeora"),

    XOJO("xojo"),

    XQUERY("xquery"),

    YAML("yaml");

    private final String name;

    Language(final String name) {
      this.name = name;
    }

    public final String getName() {
      return name;
    }

  }

  /**
   * The themes packaged with prism.
   *
   * @author Oliver Yasuna
   * @see <a href="https://github.com/PrismJS/prism/tree/v1.17.1/themes">https://github.com/PrismJS/prism/tree/v1.17.1/themes</a>
   */
  public enum Theme {

    PRISM("prism"),

    COY("prism-coy"),

    DARK("prism-dark"),

    FUNKY("prism-funky"),

    OKAIDIA("prism-okaidia"),

    SOLARIZED_LIGHT("prism-solarizedlight"),

    TOMORROW("prism-tomorrow"),

    TWILIGHT("prism-twilight");

    private final String path;

    Theme(final String path) {
      this.path = path;
    }

    public final String getPath() {
      return path;
    }

  }

}
