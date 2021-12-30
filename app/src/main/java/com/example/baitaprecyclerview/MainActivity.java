package com.example.baitaprecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvData;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvData = findViewById(R.id.rcv_data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvData.setLayoutManager(linearLayoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        rcvData.addItemDecoration(itemDecoration);

        userAdapter = new UserAdapter(this, getListUser());
        rcvData.setAdapter(userAdapter);
    }

    private List<User> getListUser() {
        List<User> list = new ArrayList<>();
        list.add(new User(R.mipmap.ic_launcher, "Leanne Graham", "Sincere@april.biz",
                "street Kulas Light,city Gwenborough", "1-770-736-8031 x56442", "Romaguera-Crona"));
        list.add(new User(R.mipmap.ic_launcher, "Ervin Howell", "Shanna@melissa.tv",
                "Street Victor Plains, City Wisokyburgh", "010-692-6593 x09125", "Deckow-Crist"));
        list.add(new User(R.mipmap.ic_launcher, "Clementine Bauch", "Nathan@yesenia.net",
                "Street Douglas Extension, City McKenziehaven", "1-463-123-4447", "Romaguera-Jacobson"));
        list.add(new User(R.mipmap.ic_launcher, "Patricia Lebsack", "Julianne.OConner@kory.org",
                "Street Hoeger Mall, City South Elvis", "493-170-9623 x156", "Robel-Corkery"));
        list.add(new User(R.mipmap.ic_launcher, "Chelsey Dietrich", "Lucio_Hettinger@annie.ca",
                "Street Skiles Walks, City Roscoeview", "(254)954-1289", "Keebler LLC"));
        list.add(new User(R.mipmap.ic_launcher, "Mrs. Dennis Schulist", "Karley_Dach@jasper.info",
                "Street Norberto Crossing, City South Christy", "1-477-935-8478 x6430", "Considine-Lockman"));
        list.add(new User(R.mipmap.ic_launcher, "Kurtis Weissnat", "Telly.Hoeger@billy.biz",
                "Street Rex Trail, City Howemouth", "210.067.6132", "Johns Group"));
        list.add(new User(R.mipmap.ic_launcher, "Nicholas Runolfsdottir V", "Sherwood@rosamond.me",
                "Street Ellsworth Summit, City Aliyaview", "586.493.6943 x140", "Abernathy Group"));
        list.add(new User(R.mipmap.ic_launcher, "Glenna Reichert", "Chaim_McDermott@dana.io",
                "Street Dayna Park, City Bartholomebury", "(775)976-6794 x41206", "Yost and Sons"));
        list.add(new User(R.mipmap.ic_launcher, "Clementina DuBuque", "Rey.Padberg@karina.biz",
                "Street Kattie Turnpike, City Lebsackbury", "024-648-3804", "Hoeger LLC"));

        return list;
    }
}