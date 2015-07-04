package com.jasonsoft.httplivestreaming.client;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

public interface VideoListService {
    @GET("/welcome/video_list")
    void getVideoList(Callback<List<VideoEntry>> callback);
}
