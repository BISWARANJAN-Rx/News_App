package com.example.newsapp.fragments;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.newsapp.MainActivity;
import com.example.newsapp.R;
import com.example.newsapp.WebviewControler;

public class dharitri_fragment extends Fragment {
    public dharitri_fragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_dharitri_fragment, container, false);

        WebView webView=view.findViewById(R.id.dharitriWebview);
        webView.loadUrl("https://www.dharitri.com/");
        webView.setWebViewClient(new WebviewControler());

        return view;
    }
}