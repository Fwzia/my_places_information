package com.example.myplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ParisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        final ArrayList<place> plcs = new ArrayList<place>();
        plcs.add(new place("Eiffel Tower","برج ايفيل",R.drawable.eiffel,
                "هو أحد أشهر المعالم الموجودة في أوروبا والعالم، في منطقة الشمال الغربي لحديقة \"شامب دي مارس\" ويعتبر أحد عجائب الدنيا السبع وهو أهم معلم سياحي في فرنسا."));
        plcs.add(new place("Louver Museum","متحف اللوفر",R.drawable.louvre,
                "من أهم المتاحف الفنية في العالم، ويقع على الضفة الشمالية لنهر السين في باريس عاصمة فرنسا. يعد متحف اللوفر أكبر صالة عرض للفن عالمياً وبه العديد من مختلف الحضارات الإنسانية."));
        plcs.add(new place("Arc de Triomphe","قوس النصر",R.drawable.arcc,
                " هو قوس يقع على رأس طريق الشانزلزيه بباريس في فرنسا وهو طريق مزين بالأشجار.وهو في ميدان شارل ديغول، ميدان النجمة سابقاً وهو ملتقى 12 طريقاً."));
        plcs.add(new place("Disney Land","ملاهى ديزنى",R.drawable.disneylandparis,"" +
                "أكبر مجمع للألعاب الترفيهية في أوروبا. يصلح للصغار والكبار على حد سواء. وتقع في باريس، فرنسا على بعد 32 كيلومتر فقط من مركز باريس في منطقة تسمى بـ مارني لا فالي، ويضم منتج ديزني لاند باريس حديقتي ملاهي بالإضافة إلى سبعة فنادق تملكها شركة ديزني."));
        plcs.add(new place("Palais Garner","قصر غارنيه",R.drawable.garnier,
                "قصر غارنييه يسمى أيضا أوبرا باريس؛يحتوي على 1600 مقعد ويقع في ميدان الأوبرا في باريس بفرنسا. كان المقر الرئيسي لفرقة أوبرا باريس من عام 1875 حتى عام 1989"));

        PlaceAdapter adapter=new PlaceAdapter(this,plcs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                place p=plcs.get(position);
                Toast.makeText(ParisActivity.this,p.getInfo(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
