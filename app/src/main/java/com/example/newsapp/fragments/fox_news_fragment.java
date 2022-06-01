package com.example.newsapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.newsapp.R;
import com.example.newsapp.WebviewControler;


public class fox_news_fragment extends Fragment {

    public fox_news_fragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fox_news_fragment, container, false);

        WebView webView=view.findViewById(R.id.foxWebview);
        webView.loadUrl("https://www.foxnews.com/");
        webView.setWebViewClient(new WebviewControler());

        return view;
    }
}