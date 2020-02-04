package imageviewer.view;

import imageviewer.model.Image;

public interface ImageDisplay {
    Image current();
    void show(Image image);
}
