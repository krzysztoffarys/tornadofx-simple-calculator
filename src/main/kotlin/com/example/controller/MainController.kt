package com.example.controller

import javafx.beans.property.SimpleDoubleProperty
import tornadofx.*

class MainController : Controller() {
    var resultLabel = SimpleDoubleProperty(0.0)
    private var lastKey = "="
    private var lastOperationKey = "="
    private var lastNumber = 0.0
    private var currentNumber = 0.0


    fun action(arg: String) {
        //on cancel
        if (arg == "cancel") {
            lastKey = "="
            lastOperationKey = "="
            lastNumber = 0.0
            currentNumber = 0.0
            resultLabel.value = currentNumber
        } else {
            if (lastOperationKey != "=") {
                when(lastOperationKey) {
                    "+" -> currentNumber += lastNumber
                    "-" -> currentNumber = lastNumber - currentNumber
                    "*" -> currentNumber *= lastNumber
                    "/" -> {
                        if (currentNumber != 0.0) {
                            currentNumber = lastNumber / currentNumber
                        } else {
                            currentNumber = 80085.0
                        }
                    }
                }
            }


            resultLabel.value = currentNumber
            lastNumber = currentNumber
            lastKey = arg
            lastOperationKey = arg
        }
    }

    fun action(arg: Int) {
        if (!lastKey.isInt()) {
            currentNumber = arg.toDouble()
            //if last key was + - * /

        } else {
            //if last key was a digit or dot
            currentNumber = (currentNumber * 10) + arg
        }
        resultLabel.value = currentNumber
        lastKey = arg.toString()
    }

}