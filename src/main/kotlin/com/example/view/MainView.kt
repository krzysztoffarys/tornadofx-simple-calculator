package com.example.view

import com.example.Styles
import com.example.controller.MainController
import javafx.geometry.Pos
import tornadofx.*

class MainView : View("Calculator") {

    private val mainController : MainController by inject()


    override val root = vbox {
        addClass(Styles.myStyle)
        alignment = Pos.TOP_RIGHT
        label {
            bind(mainController.resultLabel)
            addClass(Styles.heading)
        }
        spacing = 10.0
        hbox {
            alignment = Pos.CENTER
            spacing = 10.0
            button("1") {
                addClass(Styles.button)
                action {
                    mainController.action(1)
                }
            }
            button("2") {
                addClass(Styles.button)
                action {
                    mainController.action(2)
                }
            }
            button("3") {
                addClass(Styles.button)
                action {
                    mainController.action(3)
                }
            }

            button("+") {
                addClass(Styles.buttonOperator)
                action {
                    mainController.action("+")
                }
            }

        }

        hbox {
            alignment = Pos.CENTER
            spacing = 10.0
            button("4") {
                addClass(Styles.button)
                action {
                    mainController.action(4)
                }
            }
            button("5") {
                addClass(Styles.button)
                action {
                    mainController.action(5)
                }
            }
            button("6") {
                addClass(Styles.button)
                action {
                    mainController.action(6)
                }
            }
            button("-") {
                addClass(Styles.buttonOperator)
                action {
                    mainController.action("-")
                }
            }
        }

        hbox {
            alignment = Pos.CENTER
            spacing = 10.0
            button("7") {
                addClass(Styles.button)
                action {
                    mainController.action(7)
                }
            }
            button("8") {
                addClass(Styles.button)
                action {
                    mainController.action(8)
                }
            }
            button("9") {
                addClass(Styles.button)
                action {
                    mainController.action(9)
                }
            }
            button("*") {
                addClass(Styles.buttonOperator)
                action {
                    mainController.action("*")
                }
            }
        }

        hbox {
            alignment = Pos.CENTER
            spacing = 10.0
            button("0") {
                addClass(Styles.button)
                action {
                    mainController.action(0)
                }
            }
            button("C") {
                addClass(Styles.buttonOperator)
                action {
                    mainController.action("cancel")
                }
            }
            button("=") {
                addClass(Styles.buttonOperator)
                action {
                    mainController.action("=")
                }
            }
            button("/") {
                addClass(Styles.buttonOperator)
                action {
                    mainController.action("/")
                }
            }
        }


    }
}
