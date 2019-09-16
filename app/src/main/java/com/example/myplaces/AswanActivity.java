package com.example.myplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AswanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        final ArrayList<place> plcs = new ArrayList<place>();
        plcs.add(new place("Pyramid of Elephantine","هرم الالفانتين",R.drawable.elephantine,
                " هو جزء من مجموعة من سبعة أهرامات صغيرة متشابهة للغاية يقع هرم الفانتين في الجزء الشمالي الغربي من مدينة المملكة القديمة في الطرف الجنوبي من جزيرة الفانتين في النيل.  تم اكتشاف الهيكل في عام 1907."));
        plcs.add(new place("Philae Temple","معبد فيلة",R.drawable.aswanphilaetemple2,
                "مخصص للإلهة ايزيس خلال القرن الثالث قبل الميلاد ، فقد كانت الألهة ايزيس من اهم و اقوى الألهة في مصر التي كان يقدسها كلا من الرومان و اليونان ، فقد قام الإمبراطور اغسطس قيصر في القرن التاسع ببناء معبد للألهة ايزيس في الجهة الشمالية من معبد فيلة . وقد تسبب فيضان النيل في غرق معبد فيلة مما أدى إلي تقسيمه و اعادة تجميعه في موقع جديد فوق جزيرة اجيليكا التي تبعد حوالي 500 متراً عن مكانه الأصلي بجزيرة فيلة و ذلك بعد بناء السد العالي كما حدث في معبد ابو سمبل و معبد كلابشة خوفاً من فيضانات النيل . تضم مباني معبد فيلة معبداً للإلهة حتحور . يقدم داخل معبد فيلة عروض الصوت و الضوء بالغات المختلفة يستطيع الزائر مشاهدتها ليلاً."));
        plcs.add(new place("Temple Of Isis","معبد ايسيس",R.drawable.isis,
                "أهم المعالم السياحيه باسوان ويزوره الاف السياح كل عام"));
        plcs.add(new place("Nubian Village","قرية النوبه",R.drawable.noobaa,
                "بلاد النوبة، هو الاسم الذي أطلق على السودان قديما قبل مسماها الحالي. وكانت بلاد النوبة التاريخية موطنا لإحدى أقدم الحضارات في أفريقيا."));
        plcs.add(new place("Jazirat Aswan","جزيرة أسوان",R.drawable.egypt_aswan_nile,
                        "تقع الحديقة النباتية فى جزيرة وسط النيل بمدينة أسوان، لذا يطلق عليها جزيرة النباتات ويعد موقعها متفرد على مستوى العالم وتتجمع فيه 3 عناصر للجمال لا توجد فى أى مكان آخر على مستوى العالم"));

        PlaceAdapter adapter=new PlaceAdapter(this,plcs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                place p=plcs.get(position);
                Toast.makeText(AswanActivity.this,p.getInfo(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
