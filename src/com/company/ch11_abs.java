package com.company;
//lets learn abstact with blackpinkAlbum

//delulu class
abstract class Album{
    abstract void playSong(); //Abstract methods cannot have a body sirf naam, koi body nahi
    void pauseSong() {        // ✅ With body – allowed!
        System.out.println("Paused");
    }
}

//to make that delulu concrete(child fulfill parent dream)
class BlackPinkAlbum extends Album{
    //Class 'BlackPinkAlbum' must either be declared abstract or implement abstract method 'playSong()' in 'Album'
     void playSong(){
        System.out.println("now playingggggg du-dudu-du-dudu -BLACKPINK");
    }
//    void pauseSong(){
//        System.out.println("paused by blackpink ");
//    }

}

public class ch11_abs {
    public static void main(String[] args) {
        //    Album bpAlbum = new Album();  ❌ Not allowed!
        Album bpAlbum; // ✅ Reference is allowed

//now with help of child parent dream can be true object
        Album object = new BlackPinkAlbum();

        object.playSong();
        object.pauseSong();
    }

}
