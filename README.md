KotlinJS 编译时出现 non-modular project 错误
=====================================

执行一下命令编译本项目时：

```
npm install
./gradlew compileKotlin2Js
```

会出现一下错误：

```
Can't access property 'hello' marked with @JsModule annotation from non-modular project
```

如何理解并解决这个问题？




