package com.example.demo.view

import com.example.demo.app.Styles
import javafx.scene.control.Alert
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
        this += button {
            text = "Hi Daddy"
            action {
                alert(Alert.AlertType.NONE, "You Fucked Up!", "Go to see a doctor")
            }
        }
        this += textfield("Enter a url"){
            action {

            }
        }
    }
}