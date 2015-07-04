package com.jasonsoft.httplivestreaming.client;

import java.util.List;

public class VideoEntry {
    // !! The variable here must corresponds to json filed name
    public String name;
    public String video_thumbnail;
    public String video_content;

    @Override
    public String toString() {
        return "VideoEntry [name=" + name + " video_thumbnail=" + video_thumbnail + " video_content=" + video_content + "]";
    }
}
