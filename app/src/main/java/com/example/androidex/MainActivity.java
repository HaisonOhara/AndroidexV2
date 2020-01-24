package com.example.androidex;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.algolia.instantsearch.helpers.InstantSearch;
import com.algolia.instantsearch.helpers.Searcher;

public class MainActivity extends AppCompatActivity {
    Searcher searcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searcher = Searcher.create("62HJSAOXQT", "1687832151823b4970e022484ae66f1d", "Pokedex");
        InstantSearch helper = new InstantSearch(this, searcher);
        helper.search();
    }

    @Override
    protected void onDestroy() {
        searcher.destroy();
        super.onDestroy();
    }
}

