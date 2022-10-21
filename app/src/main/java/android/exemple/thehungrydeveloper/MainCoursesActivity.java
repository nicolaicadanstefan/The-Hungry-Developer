package android.exemple.thehungrydeveloper;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);
        Dish[] mainCourses = {
                new Dish("Tomato and squash spaghetti","Spagetti topped with a blend of beef tomatoes and butternut squash",190),
                new Dish("Bilberry and cauliflower salad","A crisp salad featuring fresh bilberry and cauliflower",345),
                new Dish("Scallop and lemon risotto","Creamy risotto rice with scallop and fresh lemon",230),
                new Dish("Chickpea and ginger stir fry","Crunchy stir fry featuring fresh chickpea and stem ginger",890),
                new Dish("Paneer and boar salad","Fried paneer and boar served on a bed of lettuce",675),
                new Dish("Coconut and popcorn cake","Moist cake made with fresh coconut and popcorn",469),
                new Dish("Malt vinegar and salmon salad","A crisp salad featuring malt vinegar and freshly-caught salmon",550),
                new Dish("Pepper and hazelnut loaf","Crunchy bread made with fresh pepper and hazelnut",345),
                new Dish("Potato and ham pie","A shortcrust pasty case filled with baby new potato and smoked ham",75),
                new Dish("Chorizo and mustard seed soup","Spanish chorizo and yellow mustard seeds combined into smooth soup",110)
        };

        ArrayAdapter<Dish> dishsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,mainCourses);

        mainCoursesList.setAdapter(dishsAdapter);
    }
}
