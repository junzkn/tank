import javafx.application.Application
import javafx.scene.input.KeyEvent
import org.itheima.kotlin.game.core.Window

class MyWindow : Window() {
    override fun onCreate() {
        println("hrllo")
    }

    override fun onDisplay() {
    }

    override fun onKeyPressed(event: KeyEvent) {
    }

    override fun onRefresh() {
    }

}


fun main(args:Array<String>){
    Application.launch(MyWindow::class.java)
}