package com.kairocosta.keepapp.ui.cardview;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.kairocosta.keepapp.R;
import com.kairocosta.keepapp.core.Note;
import com.kairocosta.keepapp.databinding.CardviewNoteBinding;
import com.mikepenz.fastadapter.items.AbstractItem;

import java.util.List;

/**
 * Created by lapesi on 08/03/17.
 */

public class CardViewNote extends AbstractItem<CardViewNote, CardViewNote.ViewHolder> {

    private Note note;

    public CardViewNote(Note note) {
        this.note = note;
    }

    @Override
    public int getType() {
        return R.id.cardview_note;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.cardview_note;
    }

    @Override
    public void bindView(ViewHolder holder, List<Object> payloads) {
        super.bindView(holder, payloads);
        holder.binding.setNote(note);
    }

    @Override
    public void unbindView(ViewHolder holder) {
        super.unbindView(holder);
        holder.binding.setNote(null);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        protected CardviewNoteBinding binding;

        public ViewHolder(View itemView) {
            super(itemView);
            binding = CardviewNoteBinding.bind(itemView);
        }
    }

}
