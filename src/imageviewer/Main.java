package imageviewer;

import imageviewer.control.MainFrame;
import imageviewer.model.Image;
import imageviewer.view.FileImageLoader;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("images");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
    }
    
}
