package imageviewer.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import imageviewer.model.Image;

public class SwingImageDisplay extends JPanel implements ImageDisplay{
    private Image currentImage;
    private int width;
    private int height;
    
    @Override
    public Image current() {
        return currentImage;
    }

    @Override
    public void show(Image image,int width, int height) {
        this.currentImage = image;
        this.width = width;
        this.height = height;
        this.repaint();
    }
    
    @Override
    public void paint(Graphics g) {
        if (currentImage == null) return;
        g.drawImage(imageOf(currentImage), 0, 0,width, height,  null);
    }

    private BufferedImage imageOf(Image image) {
        try {
            return ImageIO.read(image.stream());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    };
}
