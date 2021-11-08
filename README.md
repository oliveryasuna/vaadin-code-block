# Code Block.

Vaadin mapping for my [&lt;code-block&gt;](https://github.com/oliveryasuna/code-block) element.

## Getting Started

Creating a new `<code-block>` element is easy.

```java
new CodeBlock(Language.JAVASCRIPT, "" +
    "function print(msg) {\n" +
    "  console.log(msg);\n" +
    "}\n" +
    "\n" +
    "print('Hello, World!');");
```

You can specify the theme.

```java
new CodeBlock(Language.JAVASCRIPT, Theme.PRISM_TOMORROW, "" +
    "function print(msg) {\n" +
    "  console.log(msg);\n" +
    "}\n" +
    "\n" +
    "print('Hello, World!');");
```

If you want to remove the theme's background graphics, use `setPlain`.

```java
codeBlock.setPlain(true);
```

## License

This code is under the [BSD 3-Clause](LICENSE.txt).

## Sponsoring

If you like my work and want to support it, please consider [sponsoring](https://github.com/sponsors/oliveryasuna) me. It's how I make the time to code great
things!