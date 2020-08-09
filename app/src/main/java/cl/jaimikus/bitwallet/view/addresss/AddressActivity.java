package cl.jaimikus.bitwallet.view.addresss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import cl.jaimikus.bitwallet.R;
import cl.jaimikus.bitwallet.view.dashboard.DashboardViewModel;
import cl.jaimikus.bitwallet.view.home.HomeViewModel;
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