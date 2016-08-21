package citc.testpicasso2;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.clicky);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showTestDialog();
            }
        });

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        IconAdapter iconAdapter = new IconAdapter();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 5);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(iconAdapter);
    }

    private void showTestDialog() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        TestDialog dialog = new TestDialog();
        dialog.show(transaction, "TAG");
    }




}
