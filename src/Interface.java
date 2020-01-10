import java.awt.*;
import javax.swing.*;

public class Interface extends JFrame {
    private JPanel fileManager = new FileManager();
    private JPanel toolBar = new JPanel();

    public Interface() {
        buildInterface();
        buildFileManager();
        buildToolBar();

        setVisible(true);
    }

    private void buildInterface() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(900, 600);
        this.setTitle("Minecraft Skin Editor");
        this.getContentPane();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(
                dim.width / 2 - this.getSize().width / 2,
                dim.height / 2 - this.getSize().height / 2
        );
    }

    private void buildFileManager() {
        this.add(fileManager, BorderLayout.WEST);
    }

    private void buildToolBar() {
        this.add(toolBar, BorderLayout.NORTH);

        JButton drawButton = new JButton("DRAW");
        toolBar.add(drawButton);

        JButton eraserButton = new JButton("ERASE");
        toolBar.add(eraserButton);

        JButton colourPickerButton = new JButton("COLOUR");
        toolBar.add(colourPickerButton);
    }

    public static void main(String[] args) {
        new Interface();
    }
}
