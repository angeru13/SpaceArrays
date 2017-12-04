package ru.samsung.itschool.spacearrays;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class ImageManager {
    static int[] picId = new int[100];
    static Bitmap[] pic = new Bitmap[100];
    static int n = 0;
    static Resources resources;
    static Bitmap getPic(int id){
        for (int i=0; i<n; i++){
            if (picId[i]==id)
                return pic[i];
        }
        picId[n] = id;
        pic[n] = BitmapFactory.decodeResource(resources,id);
        return pic[n++];
    }
}
