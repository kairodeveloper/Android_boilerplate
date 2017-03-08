package com.kairocosta.keepapp.ui.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.kairocosta.keepapp.App;
import com.kairocosta.keepapp.R;
import com.kairocosta.keepapp.core.Note;
import com.kairocosta.keepapp.databinding.ActivityMainBinding;
import com.kairocosta.keepapp.ui.cardview.CardViewNote;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IAdapter;
import com.mikepenz.fastadapter.commons.adapters.FastItemAdapter;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FastItemAdapter<CardViewNote> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ButterKnife.bind(this);

        adapter = new FastItemAdapter<>();
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        binding.recyclerView.setLayoutManager(llm);
        binding.recyclerView.setAdapter(adapter);

        adapter.add(new CardViewNote(new Note("Titulo", "ashduashduahsduhausdhuashduahsudhuashduahsudhausdhaushduahsduahsduhasduahsd")));
        adapter.add(new CardViewNote(new Note("Titulo2", "ashduashduahsduhausdhuashduahsudhuashduahsudhausdhaushduahsduahsduhasduahsd2")));
        adapter.add(new CardViewNote(new Note("Titulo3", "ashduashduahsduhausdhuashduahsudhuashduahsudhausdhaushduahsduahsduhasduahsd3")));
        adapter.add(new CardViewNote(new Note("Titulo4", "ashduashduahsduhausdhuashduahsudhuashduahsudhausdhaushduahsduahsduhasduahsd4")));
        adapter.add(new CardViewNote(new Note("Titulo5", "ashduashduahsduhausdhuashduahsudhuashduahsudhausdhaushduahsduahsduhasduahsd5")));

        App.startNewThread(() -> {
            runOnUiThread(() -> {
                adapter.add(new CardViewNote(new Note("Titulo6", "ashduashduahsduhausdhuashduahsudhuashduahsudhausdhaushduahsduahsduhasduahsd6")));
            });
        });

        App.log("MainActivity", "deu certo");

        adapter.withOnClickListener((v, adapter1, item, position) -> {
            Toast.makeText(MainActivity.this, "olar voce clicou no coiso", Toast.LENGTH_SHORT).show();
            return true;
        });

    }

    @OnClick(R.id.button)
    public void setupButton(Button button) {
        Toast.makeText(MainActivity.this, "olar voce clicou no botao", Toast.LENGTH_SHORT).show();
        if(button.isPressed()) {
            button.setText("hue");
        } else {
            button.setText("opa");
        }
    }


}
