package citc.testpicasso2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class TestDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        View v = View.inflate(getActivity(), R.layout.dialog, null);

        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.recycler);
        IconAdapter iconAdapter = new IconAdapter();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 5);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(iconAdapter);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.app_name);
        builder.setView(v);
        return builder.create();
    }


}
