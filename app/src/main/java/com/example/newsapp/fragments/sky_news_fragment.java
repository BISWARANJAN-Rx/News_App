package com.example.newsapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.newsapp.R;
import com.example.newsapp.WebviewControler;


public class sky_news_fragment extends Fragment {



    public sky_news_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_sky_news_fragment, container, false);
        WebView webView=view.findViewById(R.id.skyWebview);
        webView.loadUrl("https://news.sky.com/");
        webView.setWebViewClient(new WebviewControler());
        return view;
    }
}