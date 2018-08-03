关键在于要指定`compileKotlin2Js`时，要使用`amd`规范，这样这个项目才会变成一个 **modular project**，不再报错：

```
compileKotlin2Js {
      kotlinOptions.moduleKind = "amd"
}
```