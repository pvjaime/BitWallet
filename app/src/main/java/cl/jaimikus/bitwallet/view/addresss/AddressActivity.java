package cl.jaimikus.bitwallet.view.addresss;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.lifecycle.ViewModelProvider;

import cl.jaimikus.bitwallet.R;
import cl.jaimikus.bitwallet.view.BaseActivity;
import cl.jaimikus.bitwallet.viewmodel.AddressViewModel;

public class AddressActivity extends BaseActivity {

    private AddressViewModel addressViewModel;
    public ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        addressViewModel = new ViewModelProvider(this).get(AddressViewModel.class);
        progressBar = findViewById(R.id.progress_bar);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(progressBar.getVisibility() == View.VISIBLE){
                    progressBar.setVisibility(View.GONE);
                }else{
                    progressBar.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}