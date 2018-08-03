package example

@JsModule("some-module")
external val someModule: String = definedExternally

fun main(args: Array<String>) {
    println(someModule)
}
