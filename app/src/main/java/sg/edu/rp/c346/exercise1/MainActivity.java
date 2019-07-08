package sg.edu.rp.c346.exercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView tvListItem,tvListItemDate;
    ListView ToDoList;
    ArrayList<ToDoItems> toDoListItems;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvListItem = findViewById(R.id.textViewListItem);
        tvListItemDate = findViewById(R.id.textViewDate);

        ToDoList = findViewById(R.id.listToDo);
        toDoListItems = new ArrayList<>();

        ToDoItems item1 = new ToDoItems("MSA","1/7/2019");
        ToDoItems item2 = new ToDoItems("Go for haircut","22/9/2019");

        toDoListItems.add(item1);
        toDoListItems.add(item2);

        adapter = new CustomAdapter(this, R.layout.row, toDoListItems);
        ToDoList.setAdapter(adapter);
    }
}