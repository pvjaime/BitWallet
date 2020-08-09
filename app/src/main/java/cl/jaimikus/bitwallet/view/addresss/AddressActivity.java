package cl.jaimikus.bitwallet.view.addresss;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import cl.jaimikus.bitwallet.R;
import cl.jaimikus.bitwallet.viewmodel.AddressViewModel;

public class AddressActivity extends AppCompatActivity {

    private AddressViewModel addressViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        addressViewModel = new ViewModelProvider(this).get(AddressViewModel.class);
    }
}