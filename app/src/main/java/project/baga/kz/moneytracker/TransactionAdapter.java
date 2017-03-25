package project.baga.kz.moneytracker;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Andrey on 3/25/2017.
 */

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionHolder>{

    private Context context;
    private List<Transaction> transactions;

    public TransactionAdapter(Context context, List<Transaction> transactions) {
        this.context = context;
        this.transactions = transactions;
    }

    public class TransactionHolder extends RecyclerView.ViewHolder {
        public TransactionHolder(View itemView) {
            super(itemView);
        }
    }

    @Override
    public TransactionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(TransactionHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return transactions.size();
    }
}
