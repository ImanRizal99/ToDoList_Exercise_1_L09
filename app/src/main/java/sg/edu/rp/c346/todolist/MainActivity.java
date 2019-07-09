package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvTodo;
    ArrayList<ToDoList> todoList;
    CustomAdapter aaToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodo = findViewById(R.id.lvTodo);
        todoList = new ArrayList<>();
        todoList.add(new ToDoList("MSA","1/7/2019"));
        todoList.add(new ToDoList("Go for haircut", "22/9/2019"));

        aaToDo = new CustomAdapter(this,R.layout.todolayout,todoList );
        lvTodo.setAdapter(aaToDo);

    }
}
