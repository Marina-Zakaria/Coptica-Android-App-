package Model;

/**
 * Created by Marina Zakaria on 7/3/2018.
 */

public class Letter {

    int imageId ;
    String name ;
    int videoId;

    public int getExampleId() {
        return exampleId;
    }

    public void setExampleId(int exampleId) {
        this.exampleId = exampleId;
    }

    int exampleId;
    int imageExampleId;
    int soundExampleId;

    public Letter(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }






    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getVideoId() {
        return videoId;
    }
    public int getImageId() {
        return imageId;
    }
    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public int getImageExampleId() {
        return imageExampleId;
    }

    public void setImageExampleId(int imageExampleId) {
        this.imageExampleId = imageExampleId;
    }

    public int getSoundExampleId() {
        return soundExampleId;
    }

    public void setSoundExampleId(int soundExampleId) {
        this.soundExampleId = soundExampleId;
    }
}






