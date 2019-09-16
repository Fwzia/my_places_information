package com.example.myplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DubaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        final ArrayList<place> plcs = new ArrayList<place>();
        plcs.add(new place("Burj Khalifa","برج خليفة",R.drawable.khalifa,
                "ناطحة سحاب تقع في إمارة دبي بالإمارات العربية المتحدة، ويعد برج خليفة أعلى بناء شيده الإنسان وأطول برج في العالم بارتفاع 828 مترًا."));
        plcs.add(new place("Dubai Museum","متحف دبى",R.drawable.du_musee,
                "يقع المتحف في حصن الفهيدي الواقع في منطقة بر دبي، ويعتقد أنه المبنى الأقدم في دبي."));
        plcs.add(new place("Dubai Safari Park","سفارى بارك",R.drawable.safari,
                " مصدر الطاقة الرئيسي في الحديقة هو الطاقة الشمسية.  يقع The Park في الورقاء 5 على طريق حتا.  يوجد في الحديقة 2500 حيوان من أكثر من 250 نوعًا"));
        plcs.add(new place("Dubai Ice Rink","التزج على الجليد",R.drawable.ice_rink,
                "تقع مدينة الثلج أو سكاي دبي داخل مول الإمارات في مدينة دبي، وهي من مناطق الجذب السياحي الأكثر إبداعاً، وابتكاراً، وإثارةً في الشرق الأوسط، ويمكن تمييزها من خلال النظر إلى موقعها وهو المبنى المائل الذي يقع على قمة المول، وتحيط به مجموعات من المطاعم المريحة، والشاليهات، ويمكن للزوار اللعب مع طيور البطريق، وعمل رجل ثلج، والتدحرج أسفل التلال."));
        plcs.add(new place("The Dubai Fountain","النوافير الراقصه",R.drawable.fountain,
                "نافورة دبي هي أكبر نظام نافورة في العالم.  يقع على مساحة 12 هكتارًا من صنع برج خليفة في وسط مدينة دبي في دبي ، الإمارات العربية المتحدة ،يبلغ طوله 275 مترًا ويطلق الماء حتى 500 قدم في الهواء مصحوبًا بمجموعة من الموسيقى الكلاسيكية إلى العربية والعالمية المعاصرة."));

        PlaceAdapter adapter=new PlaceAdapter(this,plcs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                place p=plcs.get(position);
                Toast.makeText(DubaiActivity.this,p.getInfo(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
