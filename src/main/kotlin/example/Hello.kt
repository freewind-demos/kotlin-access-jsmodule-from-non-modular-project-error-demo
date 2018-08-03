package example

import kotlin.browser.document

@JsModule("hello")
external fun hello(name: String): String = definedExternally

fun main(args: Array<String>) {
    document.getElementById("main")!!.innerHTML = hello("JsModule")
}