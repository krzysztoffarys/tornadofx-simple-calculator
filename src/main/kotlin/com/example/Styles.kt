package com.example

import javafx.scene.text.FontWeight
import tornadofx.*


class Styles : Stylesheet() {
    companion object {
        val heading by cssclass()
        val button by cssclass()
        val myStyle by cssclass()
        val buttonOperator by cssclass()

        private val textColor = c(255, 255, 255, 1.0)
        private val buttonColor = c(30, 30, 30)
        private val backColor = c(60, 60, 60)
        private val operatorButtonColor = c(242, 102, 18)
    }

    init {
        myStyle {
            backgroundColor += backColor
        }

        label and heading {
            padding = box(10.px)
            fontSize = 30.px
            fontWeight = FontWeight.BOLD
            textFill = textColor

        }

        button {
            prefWidth = 50.px
            prefHeight = 50.px
            textFill = textColor
            backgroundColor += buttonColor
        }

        buttonOperator {
            prefWidth = 50.px
            prefHeight = 50.px
            textFill = textColor
            backgroundColor += operatorButtonColor
        }
    }
}