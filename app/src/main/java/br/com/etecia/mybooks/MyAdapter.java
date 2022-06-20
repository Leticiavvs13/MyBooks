package br.com.etecia.mybooks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<Livros> livros;

    public MyAdapter() {
    }

    public MyAdapter(Context context, List<Livros> livros) {
        this.context = context;
        this.livros = livros;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.modelo_card_books, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textBook.setText(livros.get(position).getTitulo());
        holder.imageBook.setImageResource(livros.get(position).getMiniatura());

        holder.cardBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {

        return livros.size();
    }

    //Inner Class com o ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textBook;
        ImageView imageBook;
        CardView cardBook;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textBook = itemView.findViewById(R.id.tvModelBook);
            imageBook =itemView.findViewById(R.id.ivModelBook);
            cardBook = itemView.findViewById(R.id.cvBook);
        }

    }

}
