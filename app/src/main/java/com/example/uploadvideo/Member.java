package com.example.uploadvideo;

import android.widget.VideoView;

public class Member {

    String name,videoUrl;

    public Member(){}

    public Member(String name, String videoUrl) {
        this.name = name;
        this.videoUrl = videoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
