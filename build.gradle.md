关键在于要指定`compileKotlin2Js`时，要使用`amd`规范，这样这个项目才会变成一个 **modular project**，不再报错：

```
compileKotlin2Js {
      kotlinOptions.moduleKind = "amd"
}
```

把它修正以后，就可以正常执行编译命令：

```
./gradlew compileKotlin2Js
```

最后可以：

```
npx http-server . -o
```

可以看到打开的页面中，正常显示`Hello, JsModule!`。