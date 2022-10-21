package android.exemple.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StarterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);

        ListView startList = findViewById(R.id.list_view_starters);



        Dish[] dishes = {
                new Dish("Red leicester and pollack salad","A crisp salad featuring red leicester and pollack",999),
                new Dish("Hogget and pork tenderloin salad","A crunchy salad featuring hogget and pork tenderloin",145),
                new Dish("Chickpea and apple burgers","Tasty burgers made from fresh chickpea and crab apple, served in a roll",450),
                new Dish("Pumpkin seed and chilli loaf","Fluffy bread made with pumpkin seeds and hot chilli",60),
                new Dish("Mushroom and aubergine casserole","Chanterelle mushroom and fresh aubergine stewed",420),
                new Dish("Feta and horseradish dumplings","Thin pastry cases stuffed with tangy feta and fresh horseradish",575),
                new Dish("Aubergine and feta gyoza","Thin pastry cases stuffed with chargrilled aubergine and tangy feta",785),
                new Dish("Ugli fruit and sultana salad","Fresh ugli fruit and sultana served on a bed of lettuce",340),
                new Dish("Buttermilk and sesame crepes","Crispy crepes filled with creamy buttermilk and sesame",1030),
                new Dish("Cheese and pesto parcels","Thin filo pastry cases stuffed with fresh cheese and green pesto",955),
                new Dish("Suet and pear pudding","A rich suet pudding made with suet and organic pears",690),
                new Dish("Falafel and pepper burgers","Tasty burgers made from falafel and green pepper, served in a roll",1600),
                new Dish("Venison and fish madras","Medium-hot madras made with venison and fish",250),
                new Dish("Courgette and cocoa cake","Rich cake made with fresh courgette and cocoa",735),
                new Dish("Chicken and potato vindaloo","Spicy vindaloo made with free range chicken and fresh potato",865),
                new Dish("Blueberry and hazelnut cupcakes","Moist cupcakes made with fresh blueberry and hazelnut",545),
                new Dish("Parmesan and cinnamon bread","Crunchy bread made with parmesan and cinnamon",725),
                new Dish("Tofu and cheddar toastie","Hot slices of bread filled with crispy tofu and cheddar",385),
                new Dish("Currant and blackcurrant cake","Moist cake made with fresh currant and blackcurrant",55),
                new Dish("Chandeau and apple salad","Chandeau and granny smith apple served on a bed of lettuce",75)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        startList.setAdapter(dishesAdapter);
    }
}