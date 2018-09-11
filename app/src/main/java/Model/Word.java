package Model;

/**
 * Created by Marina Zakaria on 7/3/2018.
 */

public class Word {
   private String name ;
   private int sound;
   private int imageResourceId;
    private int category;
    private int word;

    public int getWord() {
        return word;
    }

    public void setWord(int word) {
        this.word = word;
    }


    public static int FAMILY = 3;
    public static int COLORS = 0;
    public static int ANIMALS = 2;
    public static int NUMBERS = 4;
    public static int PHRASES = 5;
    public static int BODY_PARTS = 6;



    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }


   public static final int HAS_NO_IMAGE =-1;
    public static final int HAS_NO_WORD = -1;

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }


    public Word() {
        imageResourceId=HAS_NO_IMAGE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }


}
