package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter{
    Context parent_context;
    int layout_id;
    ArrayList<ToDoList> todoList;

    public CustomAdapter(Context context, int resource,
                         ArrayList<ToDoList> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        todoList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvTodo = rowView.findViewById(R.id.tvTodo);
        TextView tvDate = rowView.findViewById(R.id.tvDate);

        // Obtain the Android Version information based on the position
        ToDoList currentVersion = todoList.get(position);

        // Set values to the TextView to display the corresponding information
        tvTodo.setText(currentVersion.getName());
        tvDate.setText(currentVersion.getDate());

        return rowView;
    }



}

