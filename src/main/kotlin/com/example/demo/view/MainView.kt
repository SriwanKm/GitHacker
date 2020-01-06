package com.example.demo.view

import com.example.demo.app.Styles
import javafx.scene.control.Alert
import javafx.scene.control.Button
import javafx.scene.control.TextField
import javafx.scene.image.Image
import javafx.scene.layout.*
import tornadofx.*
import java.io.FileInputStream

class MainView : View("Hello TornadoFX") {
    val vbox = vbox()
    var urlString: String? = "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg"
//    val input: FileInputStream = FileInputStream("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg")
    val image: Image = Image(urlString)
    val backgroundImage: BackgroundImage = BackgroundImage(image,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.DEFAULT,
            BackgroundSize.DEFAULT)
    val urlPrompt: String? = "Enter Url"
    val background = Background(backgroundImage)
    override val root = hbox {

        primaryStage.opacityProperty().value = .3



    }
    init {
        root.background = background
        val textField: TextField = textfield("")
                val button: Button = button {
            action {
                print(textField.characters)
                root.background = Background(BackgroundImage(Image(textField.characters.toString()),
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundPosition.DEFAULT,
                        BackgroundSize.DEFAULT))
            }
        }
        root += textField
        root += button
    }
}
//FileInputStream input = new FileInputStream("f:\\gfg.png");
//
//// create a image
//Image image = new Image(input);
//
//// create a background image
//BackgroundImage backgroundimage = new BackgroundImage(image,
//BackgroundRepeat.NO_REPEAT,
//BackgroundRepeat.NO_REPEAT,
//BackgroundPosition.DEFAULT,
//BackgroundSize.DEFAULT);
//
//// create Background
//Background background = new Background(backgroundimage);
//
//// set background
//hbox.setBackground(background);