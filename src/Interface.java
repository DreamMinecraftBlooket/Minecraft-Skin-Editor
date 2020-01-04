import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Interface extends JFrame {
    public Interface() {
        buildInterface();
    }

    public void buildInterface() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 600);
        this.setTitle("Minecraft Skin Editor");
        this.getContentPane();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(
                dim.width / 2 - this.getSize().width / 2,
                dim.height / 2 - this.getSize().height / 2
        );

        setVisible(true);
    }

    public static void main(String[] args) {
        new Interface();
    }
}
